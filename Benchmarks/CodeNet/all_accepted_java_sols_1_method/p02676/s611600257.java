import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int K = scan.nextInt();
    String S = scan.next();
    int x = S.length();
    if(x > K){
      String ans = S.substring(0,K);
      System.out.println(ans + "...");
    }else{
      System.out.println(S);
    }
  }
}