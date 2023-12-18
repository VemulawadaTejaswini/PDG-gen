import java.util.*;

public class Main {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int H = sc.nextInt();
			int N = sc.nextInt();
			Integer A[] = new Integer[N];
			for (int i=0; i<N; i++) {
				A[i] = sc.nextInt();
			}
			int sum = 0;
           for(int i=0; i<N; i++) {
        	   sum += A[i];
           }
		if(H <= sum) {
			System.out.println("Yes");
		}else
			System.out.println("No");
		}
		}