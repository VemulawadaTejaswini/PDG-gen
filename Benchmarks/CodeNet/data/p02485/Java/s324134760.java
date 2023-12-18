/* 各桁の総和を表示 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	while (scan.hasNext()) {
	    String str = scan.next();
	    
	    if (str.equals("0"))
		break;
	    
	    int sum = 0;
	    for (int i=0; i<str.length(); i++ )
		sum += (str.charAt(i) - '0');
	    System.out.println(sum);
	}
    }
}