import java.util.*;

public class Main{
  public static void main(String[] main){
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long V = sc.nextLong();
    long B = sc.nextLong();
    long W = sc.nextLong();
    long T = sc.nextLong();
    
    if(V<=W){
       System.out.print("NO");
    }else{
      if(Math.abs(A - B) / Math.abs(V - W) <= T){
        System.out.print("YES");
      }else{
        System.out.print("NO");
      }
    } 
  }
}
    