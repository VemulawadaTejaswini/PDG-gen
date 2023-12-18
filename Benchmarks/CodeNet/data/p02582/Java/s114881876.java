import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int count = 0;
    int ans = 0;

    for(int i=0 ; i<3 ; i++){
      if(s.charAt(i) == 'R'){
        count++;
      }else{
        count = 0;
      }
      ans = Math.max(count,ans);
    }
    System.out.println(ans);
  }
}
