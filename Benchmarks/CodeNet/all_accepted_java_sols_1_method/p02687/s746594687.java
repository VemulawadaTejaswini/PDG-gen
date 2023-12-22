import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String ans;
    if(S.contentEquals("ABC")) {
    	ans = "ARC";
    }else {
    	ans = "ABC";
    }
    System.out.println(ans);
  }
}