import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][][]room_array = new int[4][3][10];

		// Initialize "room_array" with Zero
		for(int building = 0; building < 4; building++) {
			for(int floor = 0; floor < 3; floor++) {
				for(int room = 0; room < 10; room++) {
					room_array[building][floor][room] = 0;
				}
			}
		}

		int in_count = sc.nextInt();

		int[] b = new int[in_count];
		int[] f = new int[in_count];
		int[] r = new int[in_count];
		int[] v = new int[in_count];

		for(int i = 0; i < in_count; i++) {
			b[i] = sc.nextInt();
			f[i] = sc.nextInt();
			r[i] = sc.nextInt();
			v[i] = sc.nextInt();

			room_array[b[i] - 1][f[i] - 1][r[i] - 1] += v[i];
		}

		for(int building = 0; building < 4; building++) {
			for(int floor = 0; floor < 3; floor++) {
				for(int room = 0; room < 10; room++) {
					System.out.printf(" %d", room_array[building][floor][room]);
				}
				System.out.println();
			}
			if(building < 3) {
				for (int i = 0; i < 20; i++) System.out.printf("#");
				System.out.println();
			}
		}
		sc.close();
	}
}

