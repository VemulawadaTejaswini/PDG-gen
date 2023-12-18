import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static Scanner scl = new Scanner(System.in);
	static int N = sc.nextInt();
	static int M = sc.nextInt();
	static char[][] room = new char[N][M];
	static int D = sc.nextInt();
	static int num = 0;
	public static void main(String[] args) {
		inputRoom();

			if ( M >= D) {
				setWE();
			}

			if ( N >= D) {
				setNS();
			}

		System.out.println(num);
		sc.close();
		scl.close();

	}
	private static void setWE() {
		boolean canPut = true;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M - D + 1; j++) {
				canPut = true;

				for(int k = 0; k < D; k++){
					if (Main.room[i][j + k] == '#') {
						canPut = false;
						break;
					}
				}

				if (canPut == true) {
					num++;
				}

			}
		}


	}

	private static void setNS() {
		boolean canPut = true;

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N - D + 1; j++) {
				canPut = true;

				for(int k = 0; k < D; k++){
					if (Main.room[j + k][i] == '#') {
						canPut = false;
						break;
					}
				}

				if (canPut == true) {
					num++;
				}

			}
		}


	}


	private static void inputRoom() {
		String str_room = "";

			for (int i = 0; i < N; i++) {
					str_room = scl.nextLine();
					Main.room[i] = str_room.toCharArray();
			}

	}

}
