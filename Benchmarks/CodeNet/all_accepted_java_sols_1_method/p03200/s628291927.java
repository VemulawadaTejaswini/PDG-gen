import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	String s = sc.next();
	    	long count = 0;
	    	int dis = 0;
	    	for (int i = 0; i < s.length(); i++) {
			if (String.valueOf(s.charAt(i)).equals("W")) {
				count += (i - dis);
				dis++;
			}
		}
	    	System.out.println(count);
	}
}
