
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		int s = sc.nextInt();
		s--;
		int n = sc.nextInt();
		for(int i =0 ;i < n ;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--;
			a = Math.min(s-a, a);
			b--;
			b = Math.min(s-b, b);
			int c = Math.min(a, b);
			c = c%3;
					System.out.println(c+1);
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}