import java.util.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = "";
      	System.out.println(new StringBuilder(detectChar(a, str)).reverse().toString());
    }

	public static String detectChar(int a, String b) {
      	int q = a/26;
        String c = b + returnChar(a%26);
        if (q > 0) {
          return detectChar(q, c);
        } else {
          return c;
        }
	}

	public static char returnChar(int a) {
        char b = 'a';
      	switch (a) {
          case 1: b = 'a'; break;
          case 2: b = 'b'; break;
          case 3: b = 'c'; break;
          case 4: b = 'd'; break;
          case 5: b = 'e'; break;
          case 6: b = 'f'; break;
          case 7: b = 'g'; break;
          case 8: b = 'h'; break;
          case 9: b = 'i'; break;
          case 10: b = 'j'; break;
          case 11: b = 'k'; break;
          case 12: b = 'l'; break;
          case 13: b = 'm'; break;
          case 14: b = 'n'; break;
          case 15: b = 'o'; break;
          case 16: b = 'p'; break;
          case 17: b = 'q'; break;
          case 18: b = 'r'; break;
          case 19: b = 's'; break;
          case 20: b = 't'; break;
          case 21: b = 'u'; break;
          case 22: b = 'v'; break;
          case 23: b = 'w'; break;
          case 24: b = 'x'; break;
          case 25: b = 'y'; break;
          case 26: b = 'z'; break;
        }
      	return b;
	}
}