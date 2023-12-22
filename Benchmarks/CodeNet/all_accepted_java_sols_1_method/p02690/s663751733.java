import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		for (int i=0;i<200;i++) {
			for (int j=-200;j<200;j++) {
				long A = i;
				long B = j;
				A= A*A*A*A*A;
				B= B*B*B*B*B;
				if (A-B==X) {
					System.out.println(i+" "+j);
					return ;
				}
			}
		}
	}
}