import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int ans = 0;
		
		for(int a = 0; a <= A; a++){
			for(int b = 0; b <= B; b++){
				int cc = X - 500 * a - 100 * b;
				if(cc >= 0 && cc % 50 == 0 && cc / 50 <= C) ans++;
			}
		}
		
		System.out.println(ans);
	}
}