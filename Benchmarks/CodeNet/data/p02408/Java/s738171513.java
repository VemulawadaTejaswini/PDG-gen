import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean[][] card = new boolean[4][13];

		int n = sc.nextInt();

		for (int k = 0; k < n; k++) { // ????????????????????????????????£??\

			String mark = sc.nextLine();
			int num = sc.nextInt();

			if (mark == "S") {
				card[0][num - 1] = true;
			} else if (mark == "H") {
				card[1][num - 1] = true;
			} else if (mark == "C") {
				card[2][num - 1] = true;
			} else if (mark == "D") {
				card[3][num - 1] = true;
			}
		}
		
		for(int i = 0;i < 4;i++){
			for(int j = 0;j < 13;j++){
				if(card[i][j] == false){
					if(i == 0){
						System.out.println("S" + j + 1);
					}else if(i == 1){
						System.out.println("H" + j + 1);
					}else if(i == 2){
						System.out.println("C" + j + 1);
					}else if(i == 3){
						System.out.println("D" + j + 1);
					}
				}
			}
		}
		sc.close();
	}
}