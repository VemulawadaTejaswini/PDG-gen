
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int[] count = new int[26];
	
	String S = scan.next();

	String ans = "yes";
	for (int i = 0; i < S.length(); i++) {
	    int index = S.charAt(i) - 'a';
	    count[index]++;
	    if(count[index] > 1) {
		ans = "no";
		break;
	    }
	}
	System.out.println(ans);
	scan.close();
    }
}
