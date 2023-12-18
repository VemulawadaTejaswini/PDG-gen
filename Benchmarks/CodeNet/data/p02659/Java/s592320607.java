import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ", 2);
		long a = Long.parseLong(line[0]);
		long b = 0;
		for (int i = 0; i < line[1].length(); i++) {
		    if (line[1].charAt(i) == '.') {
		        continue;
		    }
		    b *= 10;
		    b += line[1].charAt(i) - '0';
		}
	    System.out.println(a * b / 100);
	}
}
