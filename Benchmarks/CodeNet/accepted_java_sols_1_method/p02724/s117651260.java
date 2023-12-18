import java.util.Scanner;

public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();

			//500で割れる、5で割れる ex 1050
			//500で割れる、5で割れない ex 1000

			//500で割れない、5で割れる ex 300
			//500で割れない、5で割れない ex 0
			int gohyakuEn = 0;
			int goEn = 0;

			if(num/500 >= 1) {
				gohyakuEn = num/500;

				if( num%500 >=1 && num/5 >= 1) {
					int tmp = num%500;
					goEn = tmp/5;
				}
			}else if(num/5 >= 1) {
				goEn = num/5;

			}


				System.out.println( (1000 * gohyakuEn) + (5 * goEn) );


		}
}

