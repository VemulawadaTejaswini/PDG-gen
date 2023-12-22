import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int k = in.nextInt();
		String s = in.next();

		if (s.length() <= k)
			System.out.println(s);
		else
			System.out.println(s.substring(0,k) + "...");
	}
}

