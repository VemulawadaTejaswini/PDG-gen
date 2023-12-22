import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    boolean flag = true;

    for (int i = 0; i < S.length(); i++) {
    	char c = S.charAt(i);
    	if(i % 2 == 0) {
    		if(c == 'R' || c == 'U' || c == 'D') {
    			continue;
    		} else {
    			flag = false;
    			break;
    		}
    	} else {
    		if(c == 'L' || c == 'U' || c == 'D') {
    			continue;
    		} else {
    			flag = false;
    			break;
    		}
    	}
    }
    if (flag) {
    	System.out.println("Yes");
    } else {
    	System.out.println("No");
    }
  }
}