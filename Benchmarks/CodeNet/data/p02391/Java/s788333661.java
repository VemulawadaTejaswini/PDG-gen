
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author yoshkur
 */
public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			InputData inputData = new InputData(br);
			StringBuilder sb = new StringBuilder();
			sb.append("a ");
			sb.append(inputData.comparison());
			sb.append(" b");

			System.out.println(sb.toString());

		} catch (IOException | NumberFormatException e) {
			System.err.println(e.getLocalizedMessage());
		}
	}
}

class InputData {

	private Integer a;
	private Integer b;

	public InputData(BufferedReader br) throws IOException {
		String line = br.readLine().trim();
		String[] values = line.split(" ");
		this.a =Integer.valueOf(values[0]);
		this.b =Integer.valueOf(values[1]);
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

	public String comparison() {
		if (this.getA() < this.getB()) {
			return "<";
		} else if(this.getA() > this.getB()) {
			return ">";
		} else {
			return "==";
		}
	}
}