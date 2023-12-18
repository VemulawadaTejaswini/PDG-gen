import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long[] arr = new long[t];
		for (int i=0; i<t; i++) {
		    arr[i] = sc.nextLong();
		}
		sc.close();
		
		long result=1;
		long max = (long) Math.pow (10, 18);
		for(long a: arr) {
		    result*=a;
		}
		if (result >= max) 
		    result = -1;
		 System.out.println(result);
	}
}