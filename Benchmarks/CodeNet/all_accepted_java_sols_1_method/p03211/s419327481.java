import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int ans = 9999;
    for(int i=0; i<s.length()-2; i++){
      String ss = s.substring(i,i+3);
      int w = Integer.parseInt(ss);
      if(ans > Math.abs(753 - w))
         ans = Math.abs(753 - w);
    }
    System.out.println(ans);
  }
}
