import java.util.Scanner;

public class Main{
	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		int k_leftA = 0;
		int k_leftB = 0;
		int k_leftC = 0;
		int k_leftD = 0;
		int k_rightA = 0;
		int k_rightB = 0;
		int k_rightC = 0;
		int k_rightD = 0;

		while (sc.hasNext()) {
			double left = sc.nextDouble();
			double right = sc.nextDouble();

			if (1.1 <= left) {
				k_leftA++;
			} else if (0.6 <= left) {
				k_leftB++;
			} else if (0.2 <= left) {
				k_leftC++;
			} else {
				k_leftD++;
			}
			if (1.1 <= right) {
				k_rightA++;
			} else if (0.6 <= right) {
				k_rightB++;
			} else if (0.2 <= right) {
				k_rightC++;
			} else {
				k_rightD++;
			}
		}

		System.out.println(k_leftA + " " + k_rightA);
		System.out.println(k_leftB + " " + k_rightB);
		System.out.println(k_leftC + " " + k_rightC);
		System.out.println(k_leftD + " " + k_rightD);
	}
}