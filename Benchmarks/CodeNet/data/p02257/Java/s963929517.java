import java.util.Scanner;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int max = 100000001;
		boolean [] sosuu = new boolean [max];
 		
		sosuulist(sosuu, max);
 		
 		syuturyoku(sosuu);
		
	}
 
	private static void sosuulist(boolean [] sosuu, int max) {
		for (int i = 1; i <= max - 1; i++) {
			sosuu[i] = true;
		}
		sosuu[0] = false;
		sosuu[1] = false;
 
		for (int i = 2; i <= Math.sqrt(max); i++) {
			if (sosuu[i] == true) {
				for (int j = i + i; j <= max - 1; j += i) {
					sosuu[j] = false;
				}
			}
 
		}
	}
	
	private static void syuturyoku(boolean [] sosuu) {
		int [] n = new int [10000];
		int count = 0;
		
		Scanner cin = new Scanner (System.in);
		int x = cin.nextInt();
 
		for (int i = 0; i < x; i++) {
			n[i] = cin.nextInt();
			if (sosuu[n[i]] == true) count++;
		}
 
		System.out.println(count);
	}
}