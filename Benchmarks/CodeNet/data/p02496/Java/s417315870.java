import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n, x;
		String p;
		int r;
		int[][] cards = new int[4][13];
		
		n = scn.nextInt();
		for (int i = 0; i < n; i++){
			p = scn.next();
			r = scn.nextInt();
			if (p.equals("S")){
				x = 0;
			}
			else if (p.equals("H")){
				x = 1;
			}
			else if (p.equals("C")){
				x = 2;
			}
			else {
				x = 3;
			}
			cards[x][r - 1] = 1;
		}
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 13; j++){
				if (cards[i][j] != 1){
					if (i == 0) System.out.print("S ");
					if (i == 1) System.out.print("H ");
					if (i == 2) System.out.print("C ");
					if (i == 3) System.out.print("D ");
					System.out.println(j + 1);
				}
			}
		}
		scn.close();
	}
}