import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int antenas[] = new int[6];

		for (int i = 0; i < 6; i++) {
			antenas[i] = Integer.parseInt(sc.nextLine());
		}

		sc.close();

		boolean isConnect = true;

		for(int i = 0; i < 4; i++) {
			for(int j = 1; j < 5; j++) {
				if(antenas[j] - antenas[i] > antenas[5]) {
					isConnect = false;
				}
			}
		}

		if(isConnect) {
			System.out.println("Yay!");
		}else {
			System.out.println(":(");
		}


	}

}