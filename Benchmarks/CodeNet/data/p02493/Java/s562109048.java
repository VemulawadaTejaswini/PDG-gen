import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws java.io.IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] ia;

		int n = Integer.parseInt(in.readLine());
		ia = in.readLine().split(" ");
		for(--n;0 <= n; --n){
			System.out.print(ia[n]);
			if(0 < n){
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}