import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		double min = 10000;
		int ans = 0;
		
		for(int i = 0; i < N; i++){
			double m = Math.abs((T - sc.nextInt() * 0.006) - A);
			if(m < min){
				min = m;
				ans = i + 1;
			}
		}
		
		System.out.println(ans);
	}
}