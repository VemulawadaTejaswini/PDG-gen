import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int low = (int)(n/1.08);
		if ((int)(low*1.08) == n)
			System.out.println(low);
		else if ((int)((low+1)*1.08) == n)
			System.out.println(low+1);
		else
			System.out.println(":(");
	}
}