import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();

		int[] [] []   officialHouse = new int[4] [3] [10];

		int building = 0;
		int floor = 0;
		int roomNumber = 0;
		int residents = 0;

		for (int i = 0; i < num; i++) {
			building = scan.nextInt();
			floor = scan.nextInt();
			roomNumber = scan.nextInt();
			residents = scan.nextInt();

			officialHouse[building - 1] [floor - 1] [roomNumber - 1] += residents;

		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 10; k++) {
					System.out.print(" " + officialHouse [i] [j] [k]);
				}
				System.out.println();
				if (j == 3) {
					break;
				}

			}
			if (i == 3) {
				break;
			}
			System.out.println("####################");
		}
		scan.close();
	}
}