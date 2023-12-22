import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int ans = 0;
    String first = "1",second = "2";
    int harf = 0;
    while(s.length() > 0){
      s = s.substring(0,s.length()-2);
      harf = s.length()/2;
      first = s.substring(0,harf);
      second = s.substring(harf,s.length());
      if(first.equals(second)){
        break;
      }
    }
    System.out.println(s.length());
  }
}
