import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		String a =  "No";
		String b = "Yes";

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		if(A == B) {

			if(B == C) {
				if(A == C) {
					System.out.print(a);

				}else {
					System.out.print(b);

				}
			}else {
					System.out.print(b);

			}
		

		}else {
		
	 if(B == C) {
		 System.out.print(b);
	 }else {
		 if(A == C) {
			 System.out.print(b);
		 }else {
			System.out.print(a);
	}
		}
		}
}
}


