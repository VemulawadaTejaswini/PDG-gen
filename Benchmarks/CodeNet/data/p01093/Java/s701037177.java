import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run(){
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			calc(n);
		}
	}
	public void calc(int n){
		int[] p = new int[1000];
		for(int i = 0; i < n; i++){
			p[i] = sc.nextInt();
		}
		int diff = 1000000;
		
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				int d = Math.abs(p[i]-p[j]);
				if(d < diff) diff = d;
			}
		}
		
		System.out.println(diff);
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}