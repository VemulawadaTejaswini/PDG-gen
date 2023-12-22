import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int nyukyoData[][][][];
		nyukyoData = new int [4][3][10][1];
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i=0; i < n; i++){
			int b = sc.nextInt()-1;
			int f = sc.nextInt()-1;
			int r = sc.nextInt()-1;
			nyukyoData[b][f][r][0] += sc.nextInt();
		}
		for (int b=0; b < 4; b++) {
			for (int f=0; f < 3; f++) {
				for(int r=0; r < 10; r++) {
					System.out.print(" " + nyukyoData[b][f][r][0]);
					if (r == 9) {
						System.out.println("");
					}
				}
				if (f == 2 && b != 3) {
					System.out.println("####################");
				}
			}
		}
	}

}