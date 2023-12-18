import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[3];

		do {
			for(int i = 0; i < 3; i++) {
				arr[i] = sc.nextInt();
			}

			int m = arr[0];
			int f = arr[1];
			int r = arr[2];

			int s = m + f;

			if (m == -1 && f == -1 && r == -1) {
				break;
			} else if (m == -1 || f == -1){
				System.out.println("F");
			} else if (s >= 80){
				System.out.println("A");
			} else if (s >= 65 && s < 80 ){
				System.out.println("B");
			} else if (s >= 50 && s < 65 ){
				System.out.println("C");
			} else if (s >= 30 && s < 50 ){

				if (r >= 50) {
					System.out.println("C");
				} else {
					System.out.println("D");
				}

			} else if ( s < 30 ){
				System.out.println("F");
			}



		}while(true);

		sc.close();
	}

}
