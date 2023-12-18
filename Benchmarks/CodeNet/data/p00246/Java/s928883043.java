import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int[] list = new int[n];
			int sum = 0;
			for(int i = 0; i < n; i++) {
				list[i] = sc.nextInt();
				sum += list[i];
			}
			Arrays.sort(list);
			int[] count = new int[10];
			for(int i = 0; i < n; i++) {
				count[list[i]]++;
			}
			int ans = dfs(0,0,count,sum);
			
			System.out.println(ans);
		}
	}
	static int dfs(int a, int b, int[] c,int d) {
		if(a + d < 10) return b;
		int ret = 0;
		for(int i = 0; i < c.length; i++) {
			if(c[i] != 0) {
				c[i]--;
				if(a + i == 10) {
					ret = Math.max(ret, dfs(0,b+1,c,d-i));
				}
				else if(a + i < 10) {
					ret = Math.max(ret, dfs(a+i,b,c,d-i));
				}
				c[i]++;
			}
		}
		return Math.max(b, ret);
	}
	
}