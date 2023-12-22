import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String ans = null;
    for(int i = 2; i < S.length(); i=i+2) {
    	ans = S.substring(0, S.length()-i);
    	String ans1 = ans.substring(0,(S.length()-i)/2);
    	String ans2 = ans.substring((S.length()-i)/2);
    	if(ans1.equals(ans2)) break;
    }
    System.out.println(ans.length());

  }
}