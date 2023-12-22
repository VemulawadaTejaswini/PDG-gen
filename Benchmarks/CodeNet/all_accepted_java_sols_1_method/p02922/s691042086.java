import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int count=A;
		int sum=1;
		
		if(B==1) {
			System.out.println(0);
			System.exit(0);
		}
		
		for(sum=1;count<B;sum++) {
			count+=(A-1);
		}
		System.out.print(sum);
	}
}
