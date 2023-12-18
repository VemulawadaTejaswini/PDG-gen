import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int arrSize = in.nextInt(), array[] = new int[arrSize];
		for(int i = 0; i < arrSize; i++) {
			array[i] = Integer.parseInt(in.next());
		}

		int query = in.nextInt();
		for(int i = 0; i < query; i++) {
			int begin = Integer.parseInt(in.next()), end = Integer.parseInt(in.next()), k = Integer.parseInt(in.next());

			int count = 0;
			for(int j = begin; j < end; j++) {
				if(array[j] == k)count++;
			}
			out.println(count);
		}
		out.flush();
		in.close();
	}

}

