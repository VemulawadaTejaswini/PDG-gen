import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String s = sc.next();
    String ss = s;
    ss=ss.substring(a,a+1);
    if(ss.equals("-")){
      s = s.replace("-","");
      int slen = s.length();
      if(slen == a + b){
          System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }else{
      System.out.println("No");
    }
  }
}
