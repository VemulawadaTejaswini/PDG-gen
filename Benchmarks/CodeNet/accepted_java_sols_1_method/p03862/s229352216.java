import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int x  = keyboard.nextInt();
		
		 int[] a = new int[N];
		 int ame = 0;
		 long SUM = 0;
		 
		 for(int i = 0; i < N ; i++) {
			a[i] = keyboard.nextInt();
		}
		
		for(int j = 0; j < N-1; j++) {
			if(a[j] + a[j+1] > x) {
				ame = Math.min(a[j] + a[j+1] - x , a[j+1]);
				a[j+1] -= ame;
				SUM += ame;
			}
		}
		
		if(a[0] + a[1] > x) {
			SUM += (a[0] - x);
		}
		
		System.out.println(SUM);
		keyboard.close();	
	}
}
