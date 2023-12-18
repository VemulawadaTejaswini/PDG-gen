import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        String str = "";
      	System.out.println(new StringBuilder(detectChar(a, str)).reverse().toString());
    }

	public static String detectChar(long a, String b) {
        a--;  
      	String c = b + returnChar(a%26);
      	a /= 26;
        if (a > 0) {
          return detectChar(a, c);
        } else {
          return c;
        }
	}

	public static char returnChar(long a) {
      	return (char)('a' + a % 26);
	}
}