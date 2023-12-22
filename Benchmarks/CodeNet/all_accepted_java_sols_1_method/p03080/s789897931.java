import java.util.*;

public class Main{
  static int[] ans;
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    String S = sc.next();
    
    int r = 0, b = 0;
    for(int i = 0; i < N; i++){
      if(S.charAt(i) == 'R'){
        r++;
      }else{
        b++;
      }
    }
    System.out.println(r > b ? "Yes" : "No");
  }
}