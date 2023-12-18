import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		byte[][] card = new byte[4][13];
		byte n;
		String Soot;
		byte c;
		char[] soot = {'S', 'H', 'C', 'D'};
		
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 13; j++){
				card[i][j] = 0;
			}
		}
		
		n = stdIn.nextByte();
		for (int i = 0; i < n; i++){
			Soot = stdIn.next();
			c = stdIn.nextByte();
			
			if (Soot.equals("S")){
				card[0][c - 1] = 1;
			}
			else if (Soot.equals("H")){
				card[1][c - 1] = 1;
			}
			else if (Soot.equals("C")){
				card[2][c - 1] = 1;
			}
			else if (Soot.equals("D")){
				card[3][c - 1] = 1;
			}
		}
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 13; j++){
				if (card[i][j] == 0){
					System.out.println(soot[i] + " " + (j + 1));
				}
			}
		}
	}
}