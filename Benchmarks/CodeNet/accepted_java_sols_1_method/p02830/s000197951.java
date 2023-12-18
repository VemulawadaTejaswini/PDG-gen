import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		String s = in.next();
		String t = in.next();
		String result = "";
		for (int i=0; i<n; i++) {
			result += s.charAt(i) + "" + t.charAt(i);
		}
		System.out.println(result);
	}
}

