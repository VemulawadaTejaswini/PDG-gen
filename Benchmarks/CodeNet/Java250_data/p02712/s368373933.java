import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		long sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 != 0 && i % 5 != 0)
				sum  += i;
		}
		
		System.out.println(sum);
	}
}
