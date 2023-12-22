import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int c0 = 0;
    int c1 = 0;
    int len = S.length();
    String NS = S;
    int c = 0;
    for(int i = 0;i < len;i++){
      if(S.charAt(i)=='1'){
        c1++;
      }else{
        c0++;
      }
    }
    c = c1;
    if(c1 > c0)c=c0;
    if(c1==0||c0==0)c=0;
    System.out.println(c*2);
  }
}
