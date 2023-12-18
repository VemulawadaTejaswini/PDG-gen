import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 int K = sc.nextInt();
		 int X = sc.nextInt();
		 
		 Integer a[] = new Integer[2*K-1];
		 
		 for(int i=0; i<2*K-1; i++) {
			 a[i] = X - K + 1 + i;
			 System.out.println(a[i]);
		 }
		 
	}
}
