import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ?????????????????\????????????
		Scanner sc = new Scanner(System.in);

		// ?????°?????\???
		while (true) {

			int mid = sc.nextInt();
			int fnl = sc.nextInt();
			int ret = sc.nextInt();

			if(mid == -1 && fnl == -1 && ret == -1)
				break;

			if( mid == -1 || fnl == -1){

				System.out.println("F");

			} else if(mid + fnl >= 80){

				System.out.println("A");

			} else if (mid + fnl < 80 && mid + fnl >= 65){

				System.out.println("B");

			} else if (mid + fnl < 65 && mid + fnl >= 50){

				System.out.println("C");

			} else if (mid + fnl < 50 && mid + fnl >= 30){

				if(ret >= 50){

					System.out.println("C");

				} else {

				System.out.println("D");

				}

			} else if (mid + fnl < 30){

				System.out.println("F");

			}
		}
		sc.close();
	}
}