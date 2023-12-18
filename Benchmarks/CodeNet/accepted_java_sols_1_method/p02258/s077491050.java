import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[] nAry = new int[n];

		for(int i = 0; i < n ; i++){
			nAry[i] = scan.nextInt();
		}

		int maxBenefit = Integer.MIN_VALUE;
		int min = nAry[0];
		int tmpBenefit;

		for(int i = 1; i < n ; i++){

			tmpBenefit = nAry[i] - min;

			if(maxBenefit < tmpBenefit){
				maxBenefit = tmpBenefit;
			}

			if(min > nAry[i]){
				min = nAry[i];
			}
		}

		System.out.println(maxBenefit);
	}

}