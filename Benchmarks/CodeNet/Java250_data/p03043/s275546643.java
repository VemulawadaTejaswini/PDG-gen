import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		double all = 0; 
		for( int i = 1 ; i <= n ; i++ ) {
			int now = i;
			int p_all = 1;
			while( now < k ) {
				now *= 2;
				p_all *= 2;
			}
			all += 1.0/n/p_all;
		}
		
		System.out.println( (double)all );
		

	}
}
