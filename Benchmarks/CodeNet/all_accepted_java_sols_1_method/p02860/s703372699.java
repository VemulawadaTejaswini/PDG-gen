import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		if(n % 2 != 0) {

			System.out.println("No");

		}else {

			char[] tm 	 = scanner.nextLine().toCharArray();
			boolean flag = false;
			int x = n / 2 ;

			for(int i = 0; i < n / 2; i++) {

				if(tm[i] != tm[x + i]) {

					flag = true;
					break;
				}



			}

			if(flag) {

				System.out.println("No");
			}else{

				System.out.println("Yes");
			}
		}
	}

}