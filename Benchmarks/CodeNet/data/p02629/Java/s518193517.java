import java.util.*;

public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    int count = 1;
    int div = 0;
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray(); 
    String ans = "";
    String dst = "";
    
    while(true) {
    	div = (int) (n % Math.pow(26, count));
    	ans = ans + alphabet[div-1];
    	n = (long) (n / Math.pow(26, count));
    	if(n < 27) {
    		ans = ans + alphabet[(int) n-1];
    		StringBuffer sb = new StringBuffer(ans);
    		dst = sb.reverse().toString();
    		break;
    	}
    }
    System.out.println(dst);
  }
}