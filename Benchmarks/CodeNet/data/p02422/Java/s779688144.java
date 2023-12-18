import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	int q = Integer.valueOf(scan.nextLine());
	for (int i = 0; i < q; i++) {
	    String commands = scan.nextLine();
	    String[] command = commands.split(" ");
	    if (command[0].equals("print")) {
		int a = Integer.valueOf(command[1]);
		int b = Integer.valueOf(command[2]);
		print(a, b, str);
	    } else if (command[0].equals("reverse")) {
		int a = Integer.valueOf(command[1]);
		int b = Integer.valueOf(command[2]);
		str = reverse(a, b, str);
	    } else if (command[0].equals("replace")) {
		int a = Integer.valueOf(command[1]);
		int b = Integer.valueOf(command[2]);
		String p = command[3];
		str = replace(a, b, p, str);
	    }
	}
    }
    public static void print(int a, int b, String str) {
	System.out.println(str.substring(a, b + 1));
    }
    public static String reverse(int a, int b, String str) {
	int diff = b - a + 1;
	int cnt = diff / 2;
	char[] strtmp = str.toCharArray();
	for (int j = 0; j < cnt; j++) {
	    char tmp = strtmp[a+j];
	    strtmp[a+j] = strtmp[b-j];
	    strtmp[b-j] = tmp;
	}
	return String.valueOf(strtmp);
    }
    public static String replace(int a, int b, String p, String str) {
	StringBuilder sb = new StringBuilder(str);
	sb.replace(a, b+1, p);
	return sb.toString();
    }
}