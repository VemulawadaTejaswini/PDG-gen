import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] ara = new int[n];
		int[] t = new int[n];
		for(int i = 0;i<ara.length;i++) {
			ara[i] = in.nextInt();
			t[i] = ara[i];
		}
		Arrays.sort(t);
		
		int c= 0;
		for(int i = 0;i<ara.length;i++) {
			if(t[i] != ara[i]) {
				c++;
			}
		}
	
		
		if(c<3) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		

	}

}
