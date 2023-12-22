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

		int intMax = ary[0];
		//?????§?????????
		for(int i = 0; i < ary.length; i++){

			if(intMax < ary[i]){

				intMax = ary[i];
			}
		}


		int intMin = ary[0];
		//????°??????????
		for(int i = 0; i < ary.length; i++){

			if(intMin > ary[i]){

				intMin = ary[i];
			}
		}

		long dbSum = 0;
		//????¨???????
		for(int i = 0; i < ary.length; i++){

			dbSum = dbSum + ary[i];

			//System.out.println("[" + i + "]" + "intSum: " + intSum + " ary:" + ary[i]);
		}


		System.out.println(intMin + " " + intMax + " " + dbSum);
	}
}