import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int n = Integer.parseInt(line);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        String s3 = in.nextLine();
        in.close();

        int ans = 0;
        for (int i = 0 ; i < n ; i++) {
        	if (s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == s3.charAt(i)) {
        		;
        	} else if (s1.charAt(i) == s2.charAt(i)) {
        		ans = ans + 1;
        	} else if (s1.charAt(i) == s3.charAt(i)) {
        		ans = ans + 1;
        	} else if (s3.charAt(i) == s2.charAt(i)) {
        		ans = ans + 1;
        	} else {
        		ans = ans + 2;
        	}
        }
        System.out.println(ans);
    }
}