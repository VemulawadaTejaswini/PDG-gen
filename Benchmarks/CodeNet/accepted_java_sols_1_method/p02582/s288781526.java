import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int ans=0;
    int max=0;
    if(s.charAt(0)=='R'){
      ans++;
      max=Math.max(max,ans);
    }
    for(int i=1;i<s.length();i++){
      if(s.charAt(i)==s.charAt(i-1) && s.charAt(i)=='R'){
        ans++;
        max=Math.max(max,ans);
      }
      else if(s.charAt(i)=='R'){
        ans=0;
        ans++;
        Math.max(max,ans);
      }
    }
    max =Math.max(max,ans);
    System.out.println(max);
  }
}
      