import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		
		if(A==5&&B==5) {
			if(C==7) {
				System.out.print("YES");
			}
		}
		else if(B==5&&C==5) {
			if(A==7) {
				System.out.print("YES");
			}
		}
		else if(C==5&&A==5) {
			if(B==7) {
				System.out.print("YES");
			}
		}
		else {
			System.out.print("NO");
		}
		
		sc.close();
	}
}
