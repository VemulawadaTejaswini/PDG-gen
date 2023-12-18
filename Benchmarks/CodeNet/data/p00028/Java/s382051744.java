package jimang_laurant.com;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int a[] = new int[100];
		Arrays.fill(a, 0);
		int m = 0;
		while(scan.hasNext()){
			int n = scan.nextInt();
			a[n-1]++;
			m = Math.max(a[n-1], m);
		}
		for(int i = 0;i < 100;i++){
			if(a[i] == m)System.out.println(i+1);
		}
		System.exit(0);
	}

}