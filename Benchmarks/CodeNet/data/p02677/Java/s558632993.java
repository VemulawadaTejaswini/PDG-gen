
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		int A = Integer.parseInt(tokens[0]);
		int B = Integer.parseInt(tokens[1]);
		int H = Integer.parseInt(tokens[2]);
		int M = Integer.parseInt(tokens[3]);

		int totalMin = 60 * H + M;
		double hourRatio = (double) totalMin / (double) (12 * 60);
		double hourX = (double) A * Math.sin(2. * Math.PI * hourRatio);
		double hourY = (double) A * Math.cos(2. * Math.PI * hourRatio);

		double minuteRatio = (double) M / (double) 60;
		double minuteX = (double) B * Math.sin(2. * Math.PI * minuteRatio);
		double minuteY = (double) B * Math.cos(2. * Math.PI * minuteRatio);
		double distance = Math.sqrt(Math.pow(hourX - minuteX, 2.0) + Math.pow(hourY - minuteY, 2.0));
		System.out.println(distance);
	}

	void calc() {
	}

	void showResult() {
	}

}
