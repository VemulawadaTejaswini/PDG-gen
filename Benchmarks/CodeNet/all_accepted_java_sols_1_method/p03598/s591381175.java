import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < N; i++){
			int x = sc.nextInt();
			sum += 2 * Math.min(x , Math.abs(x - K));
		}
		System.out.println(sum);
	}
}