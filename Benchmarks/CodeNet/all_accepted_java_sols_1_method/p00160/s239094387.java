import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(true) {
			int dataSet = sc.nextInt();

			if(dataSet == 0) {
				break;
			}

			int sum = 0;
			for(int $ = 0; $ < dataSet; $++) {
				int big = 0;
				int weight  = 0;
				for(int i = 0; i < 4; i++) {
					if(i == 3) {
						weight = sc.nextInt();
					} else {
						big += sc.nextInt();
					}
				}

				//??§??????????????????????¨????
				if(big <= 60 && weight <= 2) {
					sum += 600;
				} else if(big <= 80 && weight <= 5) {
					sum += 800;
				} else if(big <= 100 && weight <= 10) {
					sum += 1000;
				} else if(big <= 120 && weight <= 15) {
					sum += 1200;
				} else if(big <= 140 && weight <= 20) {
					sum += 1400;
				} else if(big <= 160 && weight <= 25) {
					sum += 1600;
				}
			}

			System.out.println(sum);
		}
	}

}