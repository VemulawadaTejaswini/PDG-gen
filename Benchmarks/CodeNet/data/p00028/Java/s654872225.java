import java.util.Scanner;
import java.util.Arrays;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] a = new int [100];
		int [] count = new int [100];
		int [] countc = new int [100];
		int max;
		int j = 0;
		int x;
 		
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
    	 	x = cin.nextInt();
    	 	(count[x])++;
    	 	
    	 	for (j = 0; j < 100; j++) {
    	 		countc[j] = count[j];
    	 	}
 			
 			Arrays.sort(countc);
 			
 			max = countc[99];
 			
	 		for (j = 0; j < 100; j++) {
    	 		if (count[j] == max) {
    	 			System.out.println(j);
    	 		}
    	 	}
		}
	}
}