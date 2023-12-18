import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int aYear = 0;
		int bYear = 0;
		boolean flag = true;

		while(true) {
			aYear = sc.nextInt();
			bYear = sc.nextInt();

			if(aYear == 0 && bYear == 0) {
				break;
			}

			if(!flag) {
				System.out.println();
				flag = true;
			}


			for(int $ = aYear; $ <= bYear; $++) {
				if(($ % 4 == 0) && (($ % 100 != 0) || ($ % 400 == 0))) {
					System.out.println($);
					flag = false;
				}
			}

			if(flag) {
				System.out.println("NA");
				flag = false;
			}
		}

	}

}