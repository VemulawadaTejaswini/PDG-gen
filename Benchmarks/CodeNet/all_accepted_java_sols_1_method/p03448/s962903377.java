import java.util.Scanner;

//  B - Coins

public class Main {
  public static void main(String[] args ) throws Exception {
	final int GOHYAKU = 500;
	final int HYAKU = 100;
	final int GOJU = 50;

    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int C = Integer.parseInt(sc.next());
    int D = Integer.parseInt(sc.next());
    int count = 0;

    for(int i = 0; i <= A; i++) {
    	if(i*GOHYAKU == D) {
//    		System.out.println();
    		count++;
    	}
    	for(int m = 0; m <= B; m++) {
    		if((i*GOHYAKU + m * HYAKU == D) && m != 0) {
				count++;
    		}
    		for(int n = 0; n <= C; n++) {
				if((i*GOHYAKU + m * HYAKU + n * GOJU == D) && n != 0) {
					count++;
				}
    		}
    	}
    }

    System.out.println(count);

  }
}