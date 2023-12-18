import java.util.Scanner;

public class Main{
	public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      String S = scan.next();
      String T = scan.next();

      int ans = 0;
      for(int i = 0;i < S.length();i++){
          if(S.charAt(i) != T.charAt(i)){
              ans++;
          }
      }
      System.out.println(ans);
    }
}