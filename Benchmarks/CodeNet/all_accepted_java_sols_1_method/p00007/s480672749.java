import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	stdin = new Scanner(System.in);
		int		nWeek = stdin.nextInt();
		int		nRent = 100000;
		int		nTmp  = 0;

		for(int nLoop = 0; nLoop < nWeek; nLoop++) {
			nRent *= 1.05;
			nTmp   = nRent % 1000;
			nRent /= 1000;
			nRent  = ((nTmp > 0) ? nRent + 1 : nRent) * 1000;
		}

		System.out.printf("%d\n", nRent);
	}

}