import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		int M = keyboard.nextInt();
		int[] A= new int[N];
		int sum = 0;
		
		for(int i=0; i<N;i++) {
			int a = keyboard.nextInt();
			sum += a;
			A[i] = a*4*M;
		}
		
		int count = 0;
		for(int j=0; j<N;j++) {
			if(A[j]>=sum) {
				count++;
			}
		}
		
		if(count >= M) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

		keyboard.close();	
		
	}
}