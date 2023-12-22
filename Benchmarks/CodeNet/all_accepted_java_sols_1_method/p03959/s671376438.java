import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		String[] str1 = br.readLine().split(" ");
		String[] str2 = br.readLine().split(" ");
		int[] t = new int [n]; 
		int[] a = new int [n]; 
		int max = 0;
		int maxnum = 0;
		for(int i = 0; i < n; i++){
			t[i] = Integer.parseInt(str1[i]);
			a[i] = Integer.parseInt(str2[i]);
			if(t[i]>max && t[i]==a[i]){
				max = t[i];
				maxnum = i;
			}
		}
		// 0 check
		for(int i = maxnum; i < n; i++){
			if(max<t[i]){
				sb.append('0');
				System.out.println(sb);
				return;
			}
		}
		for(int i = maxnum; i > -1; i--){
			if(max<a[i]){
				sb.append('0');
				System.out.println(sb);
				return;
			}
		}
		// count
		int[] p = new int [n];
		p[0] = 1;
		p[n-1] = 1;
		for(int i = 1; i < n; i++){
			if(t[i]>t[i-1]){
				p[i] = 1;
			}else{
				p[i] = t[i];
			}
		}
		for(int i = n-2; i > -1; i--){
			if(a[i]>a[i+1]){
				p[i] = 1;
			}else{
				if(p[i]>a[i])
					p[i] = a[i];
			}
		}
		p[0] = 1;
		p[n-1] = 1;
		long cnt = 1;
		final long mod = 1000000007;
		for(int i = 0; i < n; i++){
			cnt = (cnt*p[i])%mod;
		}
		sb.append(cnt);
		System.out.println(cnt);
	}
}