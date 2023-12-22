import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int A=in.nextInt();
		int B=in.nextInt();
		int C=in.nextInt();
		int K=in.nextInt();
		int sum=0;
		if (K<=A && K<=(A+B)) {
			sum=K;
			System.out.println(sum);
		}else {
			int s =K-(A+B);
			sum =A-s;
			System.out.println(sum);
			
		}
	}
}