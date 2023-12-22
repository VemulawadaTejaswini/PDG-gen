import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int cnt = 0;
		for(int i = 0; i < n; i+=2) {
			if(a[i]%2 == 1) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
