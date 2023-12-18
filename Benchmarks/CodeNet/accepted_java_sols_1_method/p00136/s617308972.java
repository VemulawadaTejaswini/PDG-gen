import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	private static final int NUM = 6; //?????£???????????°

	public static void main(String[] args) {
		int dataSet = sc.nextInt();
		int[] people = new int[NUM];
 		Arrays.fill(people, 0);

		for(int $ = 0; $ < dataSet; $++) {
			double hight = sc.nextDouble();

			if(hight < 165.0) {
				people[0]++;
			} else if(hight < 170.0) {
				people[1]++;
			} else if(hight < 175.0) {
				people[2]++;
			} else if(hight < 180.0) {
				people[3]++;
			} else if(hight < 185.0) {
				people[4]++;
			} else {
				people[5]++;
			}
		}

		for(int $ = 0; $ < NUM; $++) {
			System.out.print(($ + 1) + ":");
			for(int i = 0; i < people[$]; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}