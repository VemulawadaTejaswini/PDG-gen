import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int N = sc.nextInt();
			int S = sc.nextInt();
			int W = sc.nextInt();
			int Q = sc.nextInt();
			if ((N|S|W|Q) == 0) {
				break;
			}
			
			int a[] = new int[N];
			
			int g = S;
			for(int i =0; i < N;i++){
				a[i] = (g/7)%10;
				if(g%2==0){
					g = (g/2);
				}else{
					g = (g/2)^W;
				}
			}
			int ans = 0;
			
			if(Q == 2 || Q==5){
				ans = 0;
				System.out.println(Arrays.toString(a));
				int zeroc = 0;
				for(int i = 0; i < N ; i++){
					if(a[i] != 0){
						zeroc++;						
					}
					if(a[i]%Q == 0){
						ans += zeroc;
						
					}
				}
				
				System.out.println(ans);
				continue;
			}
			
			
			int used[] = new int[Q];
			used[0] = 1;
			
			int p = 1;
			int prev = 0;
			
			for(int i = 0; i < N ;i++){
				
				int v = (prev+p*a[N-i-1])%Q;
				
				prev = v;					
				
				if(a[N - i-1] != 0){
					ans += used[v];
				}
				used[v]++;
			
				p = (p*10)%Q;
				
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}