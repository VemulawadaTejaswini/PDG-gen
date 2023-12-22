import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputSecond = Integer.parseInt(br.readLine());
		int hour = inputSecond/3600;
		int minute = (inputSecond/60)%60;
		int second = inputSecond%60;

		System.out.println(hour + ":" + minute + ":" + second);

	}

}