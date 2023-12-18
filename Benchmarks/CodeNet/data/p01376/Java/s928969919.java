import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[] count = new int[m];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(sc.nextInt() == 1) count[i]++;
			}
		}
		Arrays.sort(count);
		System.out.println(count[m-1]);
		
	}
}