import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run(){
		int p = sc.nextInt();
		int q = sc.nextInt();
		calc(p, q);
	}
	public void calc(int p, int q){
		int a = q;
		int b = p;
		int ans = 0;
		while(true){
			int c = a % b;
			if(c == 0){
				ans = b;
				break;
			}
			else{
				a = b;
				b = c;
			}
		}
		
		q = q / ans;
		
		System.out.println(q);
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}