import java.io.*;
import java.util.Scanner;

class Main {
	public static void main (String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		
		while (true) {
			int H = Integer.parseInt(in.next());
			int W = Integer.parseInt(in.next());
			
			if (H == 0 && W == 0)
				break;
			
            // Line 1
            for (int i=0; i<W; i++)
                System.out.print("#");
            System.out.println("");
            
            // Line 2 ~ Last Line - 1
            for (int i=1; i<H-1; i++) {
                System.out.print("#");
                for (int j=1; j<W-1; j++) {
                    System.out.print(".");
                }
                System.out.print("#");
                System.out.println("");
            }
            
            // Last Line
            for (int i=0; i<W; i++)
                System.out.print("#");
            System.out.println("");
            System.out.println("");
		}
	}
}