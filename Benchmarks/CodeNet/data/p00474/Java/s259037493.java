import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int[] list = new int[n];
		for(int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = 0; i < n; i++) {
			boolean[] ok = new boolean[n];
			int max = 0;
			for(int j = 0; j < n; j++) {
				if(j == 0) {
					if(list[j] > list[j+1]) {
						ok[j] = true;
						max = Math.max(max, list[j]);
					}
				}
				else if(j == n-1) {
					if(list[j] > list[j-1]) {
						ok[j] = true;
						max = Math.max(max, list[j]);
					}
				}
				else {
					if(list[j] > list[j-1] && list[j] > list[j+1]) {
						ok[j] = true;
						max = Math.max(max, list[j]);
					}
				}
			}
			count += l - max;
			for(int j = 0; j < n; j++) {
				if(ok[j]) {
					if(list[j] == max) {
						i++;
						list[j] = 0;
					}
					else {
						list[j] += l - max;
					}
				}
			}
			i--;
			
		}
		System.out.println(count);
		
	}
	
}