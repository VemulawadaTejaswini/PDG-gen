import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] arr  = in.next().toCharArray();

		int ans = 0;
		for(int i = 0; i < arr.length; ++i)
			ans += arr[i] - '0';

		System.out.println(ans);

	}
}
