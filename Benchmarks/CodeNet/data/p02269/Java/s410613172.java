import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	String[] input;
	String command, str;
	ArrayList<String> dic = new ArrayList<String>();
	for (int i = 0; i < n; i++) {
	    input = scan.nextLine().split(" ");
	    command = input[0];
	    str = input[1];
	    if (command.equals("insert")) {
		dic.add(str);
	    } else if (command.equals("find")) {
		int index = dic.indexOf(str);
		if (index != -1) {
		    System.out.println("yes");
		} else {
		    System.out.println("no");
		}
	    }
	}
    }
}