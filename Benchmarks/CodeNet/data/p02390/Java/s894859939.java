import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		print();
	}

	private static void print() throws IOException {
		int allSecond = 0;
		int hour = 0;
		int minute = 0;
		int second = 0;

		int tempHH = 1;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		allSecond = Integer.valueOf(str);

		hour = allSecond / 3600;
		tempHH =allSecond % 3600;
		minute = tempHH / 60;
		second = tempHH % 60;




		System.out.println(hour + ":" + minute + ":" + second);

	}


}