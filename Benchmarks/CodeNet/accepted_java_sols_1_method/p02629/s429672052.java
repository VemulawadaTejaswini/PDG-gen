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
    	div = (int) (n % 26);
    	if(div == 0) {
    		div = 26;
    		n--;
    	}
    	ans = ans + alphabet[div-1];
    	
    	if(n / 26 == 0) {
    		StringBuffer sb = new StringBuffer(ans);
    		dst = sb.reverse().toString();
    		break;
    	}
    	
    	n = (long) (n / 26);
    	if(n == 0) {
    		StringBuffer sb = new StringBuffer(ans);
    		dst = sb.reverse().toString();
    		break;
    	}
    }
    System.out.println(dst);
  }
}