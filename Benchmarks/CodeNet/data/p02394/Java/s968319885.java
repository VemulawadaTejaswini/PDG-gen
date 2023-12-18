import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        sc.close();

        int up = y + r;
        int ri = x + r;
        int le = y - r;
        int dw = y - r;

        if ( up <= H ) {
        	if ( ri <= W ) {
        		if ( le >= 0 ) {
        			if ( dw <= 0 ) {
        				System.out.println("Yes");
        			}
        		}
        	}
        }else {
        	System.out.println("No");
        }



	}

}
