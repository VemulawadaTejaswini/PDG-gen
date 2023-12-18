import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a,v,b,w,t;
    
    a = sc.nextInt();
    v = sc.nextInt();
    b = sc.nextInt();
    w = sc.nextInt();
    t = sc.nextInt();
    
    if(v <= w){
      System.out.println("NO");
    }else{
      int d = Math.abs(a-b);
      int d2 = (v - w) * t;
      System.out.print( d <= d2 ? "YES" : "NO");
    }
  }
}