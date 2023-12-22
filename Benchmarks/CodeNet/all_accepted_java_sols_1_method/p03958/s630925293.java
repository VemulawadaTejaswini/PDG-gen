
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int t = Integer.parseInt(sc.next());
		
		int []a = new int [t];
		
		int max =  0; 
		for(int i = 0 ; i < t ;i++) {
			a[i] = Integer.parseInt(sc.next());
			max = Math.max(max, a[i]);
		}
		
		if(t == 1) {
			System.out.println(n-1);
			return;
		}
		
		if(max <= (n+1)/2) {
			System.out.println(0);
		}
		else {
			System.out.println(max - (n -max) - 1);
		}
		
	}

}
