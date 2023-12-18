import java.util.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
	{
    	int combiNum[] = new int[51];
		for(int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				for (int c = 0; c < 10; c++) {
					for (int d = 0; d < 10; d++) {
						combiNum[a + b + c + d]++;
					}
				}
			}
		}
		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			System.out.println(combiNum[in.nextInt()]);
		}
    }
}