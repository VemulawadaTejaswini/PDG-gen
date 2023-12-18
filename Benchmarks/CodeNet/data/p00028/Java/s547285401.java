import java.util.Scanner;
import java.util.Arrays;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] a = new int [100];
		int [] count = new int [100];
		int i = 0, j = 0;
		int x = 0;
 		
		Scanner cin = new Scanner(System.in);
		while (i < 100) {
    	 	x = cin.nextInt();
    	 	i++;
    	 	count[x]++;
		}
 		
 		Arrays.sort(count);
 		
 		i = 99;
 		
 		do {
 			System.out.println(count[i]);
 			i--;
	 	} while(count[i] != count[i - 1]) ;
 		
		/*for (i = 0; i < 100; i++) {
			 System.out.println(count[i]);
		}*/
	}
}