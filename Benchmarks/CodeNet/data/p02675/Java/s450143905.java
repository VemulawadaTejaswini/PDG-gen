import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    final String N = sc.next();
    sc.close();
    int len = N.length();
    String ans;
    switch(N.charAt(len-1)) {
    case '0':
    case '1':
    case '6':
    case '8':
    	ans = "pon";
    	break;
    case '3':
    	ans = "bon";
    	break;
    default:
    	ans = "hon";
    	break;
    }
    System.out.println(ans);
  }
}