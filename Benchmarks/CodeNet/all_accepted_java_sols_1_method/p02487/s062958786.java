/* 入力された数値の組の大きさの枠を表示 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int H, W;
	while (scan.hasNext()) {
	    H = scan.nextInt();
	    W = scan.nextInt();

	    if (H==0 && W==0)
		break;
	    
	    for (int i=0; i<H; i++) {
		for (int j=0; j<W; j++) {
		    if (i==0 || i == (H-1)) {
			System.out.print("#");
		    } else if (j==0 || j==(W-1)) {
			System.out.print("#");
		    } else {
			System.out.print(".");
		    }
		}    
		System.out.print("\n");
	    }
	    System.out.print("\n");
	}
    }
}