import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long  T,X;
		long max=0;
		long sum=0;
		T = sc.nextInt();
		for(int i=0;i<T;i++) {
		X = sc.nextInt();
		if(X>max)max=X;
		sum=sum+X;
		}
		if(max>=(sum-max)){System.out.println("No");
		}else {System.out.println("Yes");
			
		}
		
	}
}
