import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		String result = "Yes";
		int numT=C/B;
		if(C%B>0) {
			numT++;
		}
		int numA=A/D;
		if(A%D>0) {
			numA++;
		}
		if(numT>numA) {
			result="No";
		}		

		System.out.println(result);
	}
}