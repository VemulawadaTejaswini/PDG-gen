import java.util.Scanner;
import java.util.ArrayDeque;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	String[] input;
	String command, str;
	ArrayDeque<String> dic = new ArrayDeque<String>();
	for (int i = 0; i < n; i++) {
	    input = scan.nextLine().split(" ");
	    command = input[0];
	    str = input[1];
	    if (command.equals("insert")) {
		dic.add(str);
	    } else if (command.equals("find")) {
		if (dic.contains(str)) {
		    System.out.println("yes");
		} else {
		    System.out.println("no");
		}
	    }
	}
    }
}