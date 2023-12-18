import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????


		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[] ary = new int[n];

		for(int i = 0; i < n; i++){

			ary[i] = scan.nextInt();
		}

		scan.close();


		int intMax = 0;
		//?????§?????????
		for(int i = 0; i < ary.length - 1; i++){

			if(ary[0] < ary[i + 1]){

				ary[0] = ary[i + 1];
			}

		}
		intMax = ary[0];

		int intMin = 0;
		//????°??????????
		for(int i = 0; i < ary.length - 1; i++){

			if(ary[0] > ary[i + 1]){

				ary[0] = ary[i + 1];
			}
		}
		intMin = ary[0];

		int intSum = 0;
		//????¨???????
		for(int i = 0; i < ary.length; i++){

			//System.out.println(intSum);
			intSum = intSum + ary[i];

		}

		System.out.println(intMin + " " + intMax + " " + intSum);
	}
}