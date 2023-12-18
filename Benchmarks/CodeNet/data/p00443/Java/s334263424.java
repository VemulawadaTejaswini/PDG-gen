import java.util.*;
import java.math.*;
public class Main{

	static int INF = 2 << 27;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int a[] = new int[n];
			int b[] = new int[n];
			int c[] = new int[n];
			int d[] = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
				c[i] = sc.nextInt()-1;
				d[i] = sc.nextInt()-1;
			}
			Data[] data = new Data[n];
			for(int i = 0; i < n; i++) {
				data[i] = new Data(a[i],b[i],c[i],d[i]);
			}
			int  start = 0;
			boolean[] use = new boolean[n];
			for(int i = 0; i < n; i++) {
				if(data[i].nextDataA != -1)
				use[data[i].nextDataA] = true;
				if(data[i].nextDataB != -1)
				use[data[i].nextDataB] = true;
			}
			for(int i = 0; i < n; i++) {
				if(!use[i]) {
					start = i;
					break;
				}
			}
			int ans = DFS(start,data);
			System.out.println(ans);
		}
	}
	static int DFS(int now, Data[] data) {
		int ACost = data[now].nextDataA == -1 ?1:DFS(data[now].nextDataA,data);
		int BCost = data[now].nextDataB == -1 ?1:DFS(data[now].nextDataB,data);
		int l = lcm(data[now].lenA * ACost, data[now].lenB * BCost);
		return l / data[now].lenA + l / data[now].lenB;
	}
	static class Data {
		int lenA;
		int lenB;
		int nextDataA;
		int nextDataB;
		Data(int a, int b, int c, int d) {
			lenA = a;
			lenB = b;
			nextDataA = c;
			nextDataB = d;
		}
	}
	static int gcd(int a, int b) {
		if(b == 0) return a;
		if(a < b) return gcd(b,a);
		return gcd(b,a % b);
		
	}
	static int lcm(int a,int b){
		  return a / gcd(a,b) * b;
		}
	
}