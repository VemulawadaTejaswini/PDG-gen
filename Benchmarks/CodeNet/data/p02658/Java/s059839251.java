import java.util.Scanner;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long[] a = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		long seki = 1;
		
		for(int i = 0; i < n; i++) {
			seki *= a[i];
		}
		
		if(seki <= Math.pow(10, 18))
			System.out.println(seki);
		else
			System.out.println(-1);
	}
}