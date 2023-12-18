import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String S = sc.nextLine();
    int s = S.length();
    int ans = 0;
    a : for(int i = 0; i < 10; i++){
      int a = 0;
      while(S.charAt(a) != '0'+i){
        a++;
        if(a >= s){
          continue a;
        }
      }
      b : for(int j = 0; j < 10; j++){
        int b = a+1;
        if(b >= s){
            continue a;
          }
        while(S.charAt(b) != '0'+j){
          b++;
          if(b >= s){
            continue b;
          }
        }
        c : for(int k = 0; k < 10; k++){
          int c = b+1;
          if(c >= s){
            continue b;
          }
          while(S.charAt(c) != '0'+k){
          c++;
            if(c >= s){
              continue c;
            }
          }
          ans++;
        }
      }
    }
    System.out.println(ans);
  }
}