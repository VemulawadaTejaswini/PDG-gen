import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int count = 0;
    int remain = 15 - S.length();
    String ans;

    for(int i = 0; i < S.length(); i++) {
    	char c = S.charAt(i);
    	if(c == 'o') {
    		count++;
    	}
    }

    count += remain;

    if(count >= 8) {
    	ans = "YES";
    } else {
    	ans = "NO";
    }

    System.out.println(ans);
  }
}