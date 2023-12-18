import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int A = Integer.parseInt(scn.next());
		int B = Integer.parseInt(scn.next());
		int C = Integer.parseInt(scn.next());
		int D = Integer.parseInt(scn.next());
 
		int a = A * B;
		int b = C * D;
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}

	}

}
