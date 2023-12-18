import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();

		String front = str.substring(0, n / 2);

		String back = str.substring(n / 2, n);

		if (front.equals(back))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}