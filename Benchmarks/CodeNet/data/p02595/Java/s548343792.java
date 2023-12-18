import java .util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);

	int inputN = sc.nextInt();
	int inputD = sc.nextInt();
	int count = 0;

	for(int i = 0; i < inputN; i++) {
		int xi = sc.nextInt();
		int yi = sc.nextInt();

		int root = xi*xi + yi*yi;

		if(root < 0) {
			break;
		}

		double  xyRoot = Math.sqrt(root);

		if(xyRoot <= inputD) {
			count++;
		}
	}
	System.out.println(count);
}
}
