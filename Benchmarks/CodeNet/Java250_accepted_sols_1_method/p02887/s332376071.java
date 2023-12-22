import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String S = sc.next();
    
    int ans = 0;
    for(int i = 0; i < N; i++){
      char c = S.charAt(i);
      if(i == 0){
        ans++;
      }else{
        if(c != S.charAt(i-1)){
          ans++;
        }
      }
    }
    System.out.println(ans);
  }
}