import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int n = N;
		int fx = 0;
		
		while(true){
			if(n == 0) break;
			fx += n % 10;
			n /= 10;
		}
		
		System.out.println((N % fx == 0) ? "Yes" : "No");
	}
}