import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    if (N%2!=0){
      System.out.println("No");
      System.exit(0);
    }
    String left = S.substring(0,N/2);
    String right = S.substring(N/2,N);
    String ans =left.equals(right)? "Yes" : "No";
    System.out.println(ans);
  }
}