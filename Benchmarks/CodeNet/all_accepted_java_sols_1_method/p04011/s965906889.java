import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args)throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (n > k){
			int a = (n - k)*y;
			int b = k * x;
			System.out.println(a + b);
		}

		if (n <= k){
			System.out.println(n * x);
		}
		
		sc.close();
	}
}
