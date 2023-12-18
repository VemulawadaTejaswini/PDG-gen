import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);		
		int A = a.nextInt();
		A = A % 10;
		if(A == 3) {
			System.out.println("bon");
		}else if(A == 0 || A == 1 || A == 6 || A == 8) {
			System.out.println("pon");
		}else{
			System.out.println("hon");
		}
	}
}