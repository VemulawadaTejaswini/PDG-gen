import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int rank = 0;

		if (x >= 400 && x <= 599){
			rank = 8;
		} else if (x >= 600 && x <= 799){
			rank = 7;
		} else if (x >= 800 && x <= 999){
			rank = 6;
		} else if (x >= 1000 && x <= 1199){
			rank = 5;
		} else if (x >= 1200 && x <= 1399){
			rank = 4;
		} else if (x >= 1400 && x <= 1599){
			rank = 3;
		} else if (x >= 1600 && x <= 1799){
			rank = 2;
		} else if (x >= 1800 && x <= 1999){
			rank = 1;
		}
		System.out.println(rank);
	}


}