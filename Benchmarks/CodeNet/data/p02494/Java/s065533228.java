import java.io.*;
import java.util.*;

class Prog10012
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int h, w;
		int i, j;
		
		h = stdIn.nextInt();
		w = stdIn.nextInt();
		
		while (h != 0 && w != 0){
			for (i = 0; i < h; i++){
				for (j = 0; j < w; j++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
			h = stdIn.nextInt();
			w = stdIn.nextInt();
		}
	}
}