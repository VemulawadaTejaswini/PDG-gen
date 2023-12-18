import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int size = in.nextInt(), arr[] = new int[size];

		arr[0] = Integer.parseInt(in.next());
		int tail = 0;

		for(int i = 1; i < size; i++) {
			int x = Integer.parseInt(in.next());

			if(x != arr[tail]) {
				arr[++tail] = x;
			}
		}

		for(int i = 0; i <= tail; i++) {
			out.printf("%d%s", arr[i], (i < tail) ? " " : "\n");
		}
		out.flush();
		in.close();
	}

}

