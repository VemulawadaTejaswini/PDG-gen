import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int intN =0;
	static int sosuCnt =0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String[] v = sc.nextLine().split(" ");

		int intN = Integer.parseInt(n);
		int intV[] = new int[intN];
		 for(int i = 0; i < v.length; i++){
			    intV[i] = Integer.parseInt(v[i]);
		 }

		Arrays.sort(intV);

		double result = 0;
		for (int i = 0; i < intV.length-1; i++) {
			if (i==0) {
				result = intV[0];
			}

			result = (result + intV[i+1])/2;
		}



		System.out.println(result);
	}
}