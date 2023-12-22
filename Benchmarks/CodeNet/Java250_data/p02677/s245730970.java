import java.util.*;
import java.math.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    int H = sc.nextInt();
    int M = sc.nextInt();
    
   if(A>=1 && A<=1000 && B>=1 && B<=1000 
      && H>=0 && H<=11 && M>=0 && M<=59){
    double hm = Math.abs(30*H +M*0.5-M*6);
    if(hm >= 180){
      hm = 360.0 - hm;
    }
   
    double ans = 0;
    if(hm == 90){
      int I  = A*A + B*B;
      ans = Math.sqrt(I);
      //String answer = String.format("%.20f",ans);
      //System.out.println(answer);
      System.out.println(ans);  
    }else{
     ans =  A*A + B*B - 2*A*B*Math.cos(Math.toRadians(hm));
     //String answer = String.format("%.20f",Math.sqrt(ans));
     //System.out.println(answer);
     System.out.println(Math.sqrt(ans));  
    }    
   }else{
     System.out.println("入力条件に違反しています");  
   }
  }
}