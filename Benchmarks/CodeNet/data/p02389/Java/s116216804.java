import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
			sb.append(getArea(inputData));
			sb.append(" ");
			sb.append(getLength(inputData));
			System.out.println(sb.toString());

		} catch (IOException | NumberFormatException e) {
			System.err.println(e.getLocalizedMessage());
		}
	}

	public static Integer getArea(InputData inputData) {
		return inputData.getHeight() * inputData.getWidth();
	}

	public static Integer getLength(InputData inputData) {
		return (inputData.getHeight() + inputData.getWidth()) * 2;
	}

}

class InputData {

	private Integer height;
	private Integer width;

	public InputData(BufferedReader br) throws IOException {
		String line = br.readLine().trim();
		String[] values = line.split(" ");
		this.height = Integer.valueOf(values[0]);
		this.width = Integer.valueOf(values[1]);
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}
}