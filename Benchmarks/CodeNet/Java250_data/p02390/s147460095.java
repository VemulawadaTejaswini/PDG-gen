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

			System.out.println(inputData.getTime());

		} catch (IOException | NumberFormatException e) {
			System.err.println(e.getLocalizedMessage());
		}
	}
}

class InputData {

	private Long second;

	public InputData(BufferedReader br) throws IOException {
		String line = br.readLine().trim();
		this.second = Long.parseLong(line);
	}

	public Long getSecond() {
		return this.second % TimeUnit.MINUTES.toSeconds(1);
	}
	
	public Long getMinute() {
		Long temp = (this.second - this.getSecond()) % TimeUnit.HOURS.toSeconds(1);
		return TimeUnit.SECONDS.toMinutes(temp);
	}
	
	public Long getHour() {
		Long temp = (this.second - this.getSecond() - this.getMinute()) % TimeUnit.DAYS.toSeconds(1);
		return TimeUnit.SECONDS.toHours(temp);
	}
	
	public String getTime() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getHour().toString());
		sb.append(":");
		sb.append(this.getMinute());
		sb.append(":");
		sb.append(this.getSecond());
		return sb.toString();
	}
}