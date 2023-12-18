import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int D = input.nextInt();
		int N = input.nextInt();
		if (D==0) {
			if (N<=99) System.out.println(N);
			else System.out.println(101);
		}else if (D==1) {
			if (N<=99) System.out.println(100*N);
			else System.out.println(10100);
		}
		else if (D==2) {
			if (N<=99) System.out.println(10000*N);
			else {
				N++;
				System.out.println(10000*N);
			}
		} 
	}
}