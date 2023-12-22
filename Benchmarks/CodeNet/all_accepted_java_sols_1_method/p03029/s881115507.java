import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int p = sc.nextInt();
    
    p += a*3;
    
    int ans = (int)p/2;
    System.out.println(ans);
  }
}