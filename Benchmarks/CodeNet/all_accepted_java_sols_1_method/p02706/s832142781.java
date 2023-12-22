import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
	

	
	
	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int m = s.nextInt();
		
		int sum=0;
		for(int i=0;i<m;i++) {
			sum+=s.nextInt();
		}
		if(sum>n) {
			System.out.println(-1);
		}
		else {
			System.out.println(n-sum);
		}
		
	}
}