
import java.util.Scanner;

public class Main {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] H = new int[N];
		for(int i=0; i<H.length; i++) {
			H[i] = scan.nextInt();
			
		}
		scan.close();
		int r=1;
		
		for(int i=1; i<N; i++) {
			for(int j=0; j<i; j++) {
				if(H[i]<H[j]) {
					break;
				}
				if(j==i-1) {
					r++;
				}
			}
		}

		System.out.println(r);

	}

}
