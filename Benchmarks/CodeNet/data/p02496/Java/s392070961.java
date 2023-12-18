import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
		int card[][] = new int[4][13];
		int n = Integer.parseInt(in.next());
		
		for (int i=0; i<n; i++) {
			String patterm = in.next();
			int num = Integer.parseInt(in.next());
			int iPatterm = 0;
			
			if (patterm.equals("S")) {
				iPatterm = 0;
			} else if (patterm.equals("H")) {
				iPatterm = 1;
			} else if (patterm.equals("C")) {
				iPatterm = 2;
			} else if (patterm.equals("D")) {
				iPatterm = 3;
			}
			
			card[iPatterm][num-1] = 1;
		}
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<13; j++) {
				if (card[i][j] == 0) {
					switch (i) {
						case 0:
							System.out.print("S ");
							break;
						case 1:
							System.out.print("H ");
							break;
						case 2:
							System.out.print("C ");
							break;
						case 3:
							System.out.print("D ");
							break;
					}
					System.out.println(j+1);
				}
			}
		}
	}
}