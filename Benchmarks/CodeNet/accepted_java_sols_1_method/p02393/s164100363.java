import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		//System.out.println("??\???>>");

		Scanner scan = new Scanner(System.in);

		int box = 3;
		int ary[];
		ary = new int[box];
		for(int i = 0; i < ary.length ; i++){

			ary[i] = scan.nextInt();
			//System.out.println(i + ":"  + ary[i]);
		}


		for(int i = 0; i < ary.length; i++ ){

			for(int j = i + 1; j < ary.length; j++){

				if(ary[i] > ary[j]){
					int temp = ary[i];
					ary[i] = ary[j];
					ary[j] = temp;
				}
			}

		}

		System.out.print(ary[0]);
		System.out.print(" ");
		System.out.print(ary[1]);
		System.out.print(" ");
		System.out.println(ary[2]);
	}

}