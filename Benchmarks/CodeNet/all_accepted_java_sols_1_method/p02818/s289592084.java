import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		long A = scan.nextLong();
		long B = scan.nextLong();
		long K = scan.nextLong();
		scan.close();

		if(A+B>K) {
			if(A>=K) {
				A=A-K;
			}else{
				B=B+(A-K);
				A=0;
			}
		}else {
			A=0;
			B=0;
		}
		System.out.println(A+" "+B);
	}
}