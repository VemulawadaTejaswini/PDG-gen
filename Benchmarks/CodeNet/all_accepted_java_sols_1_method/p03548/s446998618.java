import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int Z = sc.nextInt();
    int ans = X / (Y+Z);
    if(X %(Y+Z) >= Z){
      System.out.println(ans);
    }else{
      System.out.println(ans-1);
    }
    
  }
}
