import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	int max = 7368792;
	Scanner sc = new Scanner(System.in);
	public void run(){
		while(true){
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(m==0 && n==0) break;
			calc(m, n);
		}
	}
	public void calc(int m,int n){
		int[] list = new int[max];
		
		int now = m;
		for(int i = 0; i < n; i++){
			while(now < max){
				if(list[now] == 0){
					int k = now;
					while(k < max){
						list[k] = 1;
						k += now;
					}
					now += 1;
					break;
				}
				now+=1;
			}
		}
		
		int ans = 0;
		int flag = 0;
		for(int i = m; i < max; i++){
			if(list[i] == 0){
				if(flag == 1) {
					ans = i;
					break;
				}
			}
			else flag = 1;
		}
		
		System.out.println(ans);
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}