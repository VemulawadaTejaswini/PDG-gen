import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    int max = 0;
    int now = 0;
    for(int i = 0;i<n;i++){
      now = 0;
      for(int j = i + 1;j<=n;j++){
        String ss = s.substring(j-1,j);
        if(ss.equals("A") || ss.equals("C") || ss.equals("G") || ss.equals("T")){
          now++;
          continue;
        }else{
          break;
        }
      }
      if(max < now){
        max = now;
      }
    }
    System.out.println(max);
  }
}
