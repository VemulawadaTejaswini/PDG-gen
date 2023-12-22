import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String X = sc.nextLine();
    char[] num = new char[4];
    boolean judge = true;

    for(int i = 0; i < 4; i++) {
    	num[i] = X.charAt(i);
    }

    for(int i = 0; i < 3; i++) {
    	if(num[i] == num[i+1]) {
    		judge = false;
    		break;
    	}
    }

    if(judge) {
    	System.out.println("Good");
    } else {
    	System.out.println("Bad");
    }
  }
}