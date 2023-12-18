import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	int[][] list;
	String[] message;
	public void run(){
		int n = sc.nextInt();
		calc(n);
	}
	public void calc(int n){
		list = new int[n+1][n+1];
		message = new String[n+1];
		
		for(int i = 1; i < n+1; i++){
			int k = sc.nextInt();
			String s = sc.next();
			
			list[k][i] = 1;
			message[i] = s;
		}
		
		print(-1, 0, n);
	}
	public void print(int depth, int k, int n){
		if(k != 0){
			for(int i = 0; i < depth; i++){
				System.out.print(".");
			}
			System.out.println(message[k]);
		}
		for(int i = 0; i < n+1; i++){
			if(list[k][i] == 1){
				print(depth+1, i, n);
			}
		}
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}