import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    
    if(a<=123 && a>=1 && b<=123 && b>=1 && c<=123 && c>=1 
       && d<=123 && d>=1 && e<=123 && e>=1){
        int a1 = 0;
      int b1 = 0;
      int c1 = 0;
      int d1 = 0;
      int e1 = 0;
      if(a % 10 != 0){
       a1 = (int)Math.round((a+5)/10.0)*10;
      }else{
        a1 = a;
      }
      if(b % 10 != 0){
       b1 = (int)Math.round((b+5)/10.0)*10;
      }else{
        b1 = b;
      }
      if(c % 10 != 0){
       c1 = (int)Math.round((c+5)/10.0)*10;
      }else{
        c1 = c;
      }
      if(d % 10 != 0){
       d1 = (int)Math.round((d+5)/10.0)*10;
      }else{
        d1 = d;
      }
      if(e % 10 != 0){
       e1 = (int)Math.round((e+5)/10.0)*10;
      }else{
        e1 = e;
      }
      
      int ans = a1 + b1 + c1 + d1 + e1;
      
      int a2 = a1 - a;
      int b2 = b1 - b;
      int c2 = c1 - c;
      int d2 = d1 - d;
      int e2 = e1 - e;
      
      int[] list = {a2,b2,c2,d2,e2};
      
      int intMax = list[0];
      for(int i = 1; i < list.length; i++){
        if(intMax < list[i] && intMax != 10 && list[i] != 10){
          intMax = list[i];
        }
      }
      int answer = ans - intMax;
      System.out.println(answer);
      
    }else{
       System.out.println("入力範囲に違反しています");
    }
  }
}