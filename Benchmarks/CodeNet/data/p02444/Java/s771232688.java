import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int size = in.nextInt(), arr1[] = new int[size], arr2[] = new int[size];
		for(int i = 0; i < size; i++) {
			arr1[i] = Integer.parseInt(in.next());
		}

		int query = in.nextInt();
		for(int i = 0; i < query; i++) {
			int begin = Integer.parseInt(in.next()), middle = Integer.parseInt(in.next()), end = Integer.parseInt(in.next());
			int sta1 = end - middle, sta2 = end - begin;

			for(int j = 0; j < sta2; j++) {
				arr2[begin + ((j + sta1) % sta2 )] = arr1[begin + j];
			}

			for(int j = 0; j < sta2; j++) {
				arr1[begin + j] = arr2[begin + j];
			}
		}

		for(int i = 0; i < size; i++) {
			out.printf("%d%s", arr1[i], (i < size - 1) ? " " : "\n");
		}
		out.flush();
		in.close();
	}

}

