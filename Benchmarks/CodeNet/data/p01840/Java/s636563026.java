import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run(){
		int n = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		calc(n, m, t);
	}
	public void calc(int n, int m, int t){
		int[] memo = new int[10000];
		
		int before = 0;
		for(int i = 0; i < n; i++){
			int a = sc.nextInt();
			int start = a - m;
			int end = a + m;
			if(start < before) start = before;
			
			for(int j = start; j < end; j++){
				if(j < t) memo[j] = -1;
			}
		}
		
		int sum = t;
		for(int i = 0; i < t; i++){
			sum += memo[i];
		}
		
		System.out.println(sum);
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}