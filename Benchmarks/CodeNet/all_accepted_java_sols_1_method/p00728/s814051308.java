import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int judge;
		List<Integer> sumSet = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

		boolean continueFrag = false;

		while (true) {

			judge = sc.nextInt();
			if(judge==0)break;


			int[] point = new int[judge];

			for (int pointSet = 0; pointSet < judge; pointSet++) {

				point[pointSet] = sc.nextInt();

			}

			Arrays.sort(point);
			int sum = 0;

			for (int sumNum = 1; sumNum < judge - 1; sumNum++) {
				//			int sum;
				sum += point[sumNum];
			}
			sum = sum / (judge - 2);
			sumSet.add(sum);



		}
		for (int output : sumSet) {
			System.out.println(output);
		}
	}
}

