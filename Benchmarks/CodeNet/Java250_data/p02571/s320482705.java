import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] ss = s.toCharArray();
    String t = sc.next();
    char[] tt = t.toCharArray();
    int difmin = 100000;
    for(int i = 0;i<=s.length()-t.length();i++){
      int dif = 0;
      for(int j = 0;j<t.length();j++){
        if(ss[i+j]!=tt[j])dif++;
      }
      difmin = Math.min(dif,difmin);
    }
    System.out.println(difmin);
  }
}
