import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in));
		while (true) {
			String[] inputs = in.readLine().split(" ");
			int h = Integer.parseInt(inputs[0]);
			int w = Integer.parseInt(inputs[1]);
			if ((h == 0) && (w == 0)) {
				break;
			}
			for (int i = 0; i < w; ++i) {
				System.out.print("#");
			}
			System.out.println();
			for (int j = 2; j < h; ++j) {
				System.out.print("#");
				for (int i = 2; i < w; ++i) {
					System.out.print(".");
				}
				System.out.println("#");
			}
			for (int i = 0; i < w; ++i) {
				System.out.print("#");
			}
			System.out.println();
			System.out.println();
		}
		in.close();
	}
}