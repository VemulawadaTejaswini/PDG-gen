import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    int H = sc.nextInt();
    int M = sc.nextInt();
      
    double m = M * 6;
    double h = 30*H +M*0.5;
    int hm = (int)(h - m);
    if(hm > 180){
      hm = hm - 180;
    }
   
    double ans = 0;
    if(hm == 90){
      int I  = A*A + B*B;
      ans = Math.sqrt(I);
      System.out.println(ans);  
    }else{
     ans =  A*A + B*B - 2*A*B*Math.cos(Math.toRadians(hm));
     System.out.println(Math.sqrt(ans));  
    }    
  }
}