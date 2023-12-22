import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		String result = "Yes";

		if(A==B && B==C && A==C) {
			result="No";

		}else if(A!=B && B!=C && A!=C) {
			result="No";
		}
		System.out.println(result);
	}
}