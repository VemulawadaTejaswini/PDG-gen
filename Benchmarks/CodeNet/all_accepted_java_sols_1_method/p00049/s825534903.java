import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] blood = new int[4];
		Arrays.fill(blood, 0);

		while(sc.hasNext()) {
			String[] str = sc.next().split(",");

			if(str[1].equals("A")) {
				blood[0]++;
			} else if(str[1].equals("B")) {
				blood[1]++;
			} else if(str[1].equals("AB")) {
				blood[2]++;
			} else {
				blood[3]++;
			}
		}

		for(int $ = 0; $ < blood.length; $++) {
			System.out.println(blood[$]);
		}

	}

}