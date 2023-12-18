import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int A,B,C,D;
		Scanner scan = new Scanner(System.in);
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		D = scan.nextInt();
		
		while(true) {
			if(A <= 0 || C <= 0) break;
			C -= B;
			if(A <= 0 || C <= 0) break;
			A -= D; 
		}
		if(C <= 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
