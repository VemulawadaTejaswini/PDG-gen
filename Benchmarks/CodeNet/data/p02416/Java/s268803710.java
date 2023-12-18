import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;


		do {
			sum = 0;
			String n = sc.nextLine();


			if(n.equals("0")) {
				break;
			}

			String tmp[] = n.split("");

			for (int i = 0; i < tmp.length; i++) {
				sum += Integer.parseInt(tmp[i]);
			}

			System.out.println(sum);
		}while(true);

		sc.close();

	}

}
