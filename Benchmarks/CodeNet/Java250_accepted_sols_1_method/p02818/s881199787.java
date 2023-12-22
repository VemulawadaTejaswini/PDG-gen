import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long A,B,K,n;
		do {
			A = stdIn.nextLong();
			B = stdIn.nextLong();
			K = stdIn.nextLong();
		}while(A<0||A>Math.pow(10, 12)||B<0||B>Math.pow(10, 12)||K<0||K>Math.pow(10, 12));
		if(A>K) {
			A -=K;
		}else {
			if((B-(K-A))<0){
				B = 0;
			}else {
				B -=(K-A);
			}
			A = 0;
		}
		System.out.println(A+" "+B);
		}
}
