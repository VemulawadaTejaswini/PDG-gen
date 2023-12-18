import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int H = sc.nextInt();
		int L = sc.nextInt();
		int[] t = new int[N];
		int[] h = new int[N];
		for(int i = 0; i < N; i++) {
			t[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		int now = 0;
		int money = 0;
		while(true) {
			now %= N;
			boolean B = false;
			boolean C = false;
			if(t[now] != 0) {
				if(T + 1 > L) B = true;
				T++;
				money += 10;
				t[now]--;
			}
			else if(h[now] != 0) {
				H++;
				money += 100;
				h[now]--;
			}
			else {
				C = true;
			}
			
			if(money >= 90) {
				money -= 90;
				if(T * 10 >= money) {
					T -= money/10;
					t[now] += money/10;
				}
				else {
					B = true;
				}
			}
			if(B || C) {
				System.out.println((now+1));
				break;
			}
			now++;
			
			
		}
		
	}
}