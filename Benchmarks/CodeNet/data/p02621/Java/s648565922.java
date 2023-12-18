import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a = sc.nextInt();
    int a2 = (int)Math.pow(a, 2);
    int a3 = (int)Math.pow(a, 3);
    int ans = (int)(a+a2+a3);
    System.out.println(ans);
    
  }
}