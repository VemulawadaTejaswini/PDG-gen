import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    int s = S.length();
    
    int ans = 0;
    for(int i = 0; i < s/2; i++){
      if(S.charAt(i) != S.charAt(s-i-1)){
        ans++;
      }
    }
    System.out.println(ans);
  }
}