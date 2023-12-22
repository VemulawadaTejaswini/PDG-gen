import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Main {

	static Deque<Integer> stack = new ArrayDeque<>();
	static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

	static int count = 0;
	static int n;

	static boolean flag = false;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			if(str[i].equals("1")) {
				count++;
			}
		}
		System.out.println(count);
	}
}