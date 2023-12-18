/* データをオウム返し 0を受け取ったら終わる */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	int count = 0;
	Scanner scan = new Scanner(System.in);
	int n;
	
	while ((n = scan.nextInt()) != 0) {
	    count++;
	    System.out.println("case "+count+":"+n);
	}
    }
}