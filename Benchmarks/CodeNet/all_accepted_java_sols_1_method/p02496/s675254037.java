import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean[][] cards = new boolean[4][15];
		
		int x = input.nextInt();
		
		for (int i = 0; i < x; i++){
			String suit = input.next();
			int num = input.nextInt();
			
			int suitNum;
			if (suit.equals("S"))suitNum = 0;
			else if (suit.equals("H"))suitNum = 1;
			else if (suit.equals("C"))suitNum = 2;
			else suitNum = 3;
			cards[suitNum][num] = true;
		}
		
		for (int i = 0; i < 4; i++){
			for (int j = 1; j <= 13; j++){
				if (!cards[i][j]){
					switch (i){
					  case 0:
					    System.out.println("S " + j);
						break;
					  case 1:
					    System.out.println("H " + j);
						break;
					  case 2:
					    System.out.println("C " + j);
						break;
					  case 3:
					    System.out.println("D " + j);
						break;
					}
				}
			}
		}
	}
}