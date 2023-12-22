
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int ans = 0;
		int tmp = 1;
		while(tmp<B) {
			ans++;
			tmp += A-1; 
		}
		
		System.out.println(ans);
	}
	
}