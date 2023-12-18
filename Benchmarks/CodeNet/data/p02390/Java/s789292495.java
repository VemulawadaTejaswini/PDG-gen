import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		int h = num / 3600;
		num = num % 360; //残りの秒数

		int m = num / 60;
		num = num % 60; //残りの秒数

		int s = num;

		System.out.println(h + ":" + m + ":" +  s);

	}

}