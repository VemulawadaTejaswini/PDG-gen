import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int seconds = Integer.parseInt(br.readLine());

		int hh = seconds / (60 * 60);
		int mm = seconds % (60 * 60) / 60;
		int ss = seconds % (60 * 60) % 60;

		System.out.println(hh + ":" + mm + ":" + ss);
	}
}