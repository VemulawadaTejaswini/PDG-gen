import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    int ans = 0;
    for (int i = S.length(); i > 0 ; i--){
      ans = ans + Integer.parseInt(S.substring(i-1,i));
    }
    if (ans % 9 == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
