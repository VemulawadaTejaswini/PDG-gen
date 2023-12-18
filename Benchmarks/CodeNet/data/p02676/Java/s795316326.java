import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int K = sc.nextInt();
    
    if(S.length() <= K )
      System.out.println(S);
    else
      System.out.println( S.substring(0,1) + "..." );
  }
}