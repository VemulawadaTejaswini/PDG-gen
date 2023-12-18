import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int ans = 0;
    for(int i = 0;i<s.length()-1;i++){
      if(s.substring(i,i+2).equals("BW")||s.substring(i,i+2).equals("WB")){
        ans++;
      }
    }
    System.out.println(ans);
  }
}
