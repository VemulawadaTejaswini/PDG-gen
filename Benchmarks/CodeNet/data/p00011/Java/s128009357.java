

import java.util.Scanner;

class Main{


	public static void main(String[] a){

		Scanner sc = new Scanner(System.in);


		int tatebo = sc.nextInt();
		int yokobo = sc.nextInt();

		int num [] = new int[tatebo];
		for(int i = 0; i < tatebo; i++) {
			num[i] = i + 1;
		}


		for(int i = 0; i < yokobo; i++) {

			String tmp1 = sc.next();
			String tmp2 [] = tmp1.split(",");
			int tmp3 = 0;

			int x = Integer.valueOf(tmp2[0]) - 1;
			int y = Integer.valueOf(tmp2[1]) - 1;


			tmp3 = num[x];
			num[x] = num[y];
			num[y] = tmp3;
		}


		for(int i: num) {

			System.out.println(String.valueOf(i));
		}

	}

}