import java.util.Scanner;
public class Main {
	static int[][] cards = new int[4][13];
		
	static void counter(String str, int n) {
		if(str.equals("S"))
			cards[0][n - 1]++;
		else if(str.equals("H"))
			cards[1][n - 1]++;
		else if(str.equals("C"))
			cards[2][n - 1]++;
		else
			cards[3][n - 1]++;
	}
	
	static void print_cards() {
		for(int r = 0; r < cards.length; r++)
			for(int c = 0; c < cards[r].length; c++) {
				if(cards[r][c] == 0) {
					switch(r) {
					case 0: System.out.print("S ");  break;
					case 1: System.out.print("H ");  break;
					case 2: System.out.print("C ");  break;
					default:System.out.print("D ");  break;
					}
					System.out.println(c + 1);
				}	
			}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int num = stdIn.nextInt();
		
		for(int r = 0; r < num; r++) {
			String str = stdIn.next();
			int n = stdIn.nextInt();
			counter(str, n);
		}
		print_cards();
	}

}