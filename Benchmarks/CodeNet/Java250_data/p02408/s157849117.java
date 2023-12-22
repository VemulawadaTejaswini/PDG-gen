import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int[][] cards = new int[4][13];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cards[i][j] = 0;
			}	
		}
		
		String x = "";
		try {
			x = in.readLine();
			int num = Integer.parseInt(x);
			
			for (int i = 0; i < num; i++) {
				x = in.readLine();
				String[] card = x.split(" ");

				int number = (Integer.parseInt(card[1]) - 1);
				switch (card[0].charAt(0)) {
				case 'S' :
					cards[0][number] = 1;
					break;
				case 'H' :
					cards[1][number] = 1;
					break;
				case 'C' :
					cards[2][number] = 1;
					break;
				case 'D' :
					cards[3][number] = 1;
					break;
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				if (cards[i][j] == 0) {
					switch (i) {
					case 0 :
						System.out.println("S " + (j + 1));
						break;
					case 1 :
						System.out.println("H " + (j + 1));
						break;
					case 2 :
						System.out.println("C " + (j + 1));
						break;
					case 3 :
						System.out.println("D " + (j + 1));
						break;
					}
				}
			}	
		}
	}
}