import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean card[][] = new boolean[4][13];
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			String suit = scan.next();
			int rank = scan.nextInt() - 1;
			switch(suit){
			case "S":
				card[0][rank] = true;
				break;
			case "H":
				card[1][rank] = true;
				break;
			case "C":
				card[2][rank] = true;
				break;
			case "D":
				card[3][rank] = true;
				break;
			}
		}
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 13; j++){
				if(!card[i][j]){
					switch(i){
					case 0:
						System.out.println("S " + (j + 1)); //?????£??????????????????j+1??¨?¨????????????¨???????????¨????????±?????????
						break;
					case 1:
						System.out.println("H " + (j + 1));
						break;
					case 2:
						System.out.println("C " + (j + 1));
						break;
					case 3:
						System.out.println("D " + (j + 1));
						break;
					}
				}
			}
		}
		//System.out.println();
	}
}