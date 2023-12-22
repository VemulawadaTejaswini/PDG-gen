import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String s = sc.next();
    String s1 = " ";
    String s2 = " ";
    int ans = 0;

    for(int v1 = 0; v1 < 10; v1++){
      int p1 = 0;
      for(int i = 0; i < n; i++){
        if(s.charAt(i) == v1 + '0'){
          s1 = s.substring(i + 1);
          p1 = 1;
          break;
        }
      }
      if(p1 == 0){
        continue;
      }
      for(int v2 = 0; v2 < 10; v2++){
        int p2 = 0;
        for(int i = 0; i < s1.length(); i++){
          if(s1.charAt(i) == v2 + '0'){
            s2 = s1.substring(i + 1);
            p2 = 1;
            break;
          }
        }
        if(p2 == 0){
          continue;
        }
        for(int v3 = 0; v3 < 10; v3++){
          for(int i = 0; i < s2.length(); i++){
            if(s2.charAt(i) == v3 + '0'){
              ans += 1;
              break;
            }
          }
        }
      }
    }


    System.out.println(ans);
  }
}
