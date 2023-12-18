import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sr = new Scanner(System.in);
    int A = sr.nextInt();
    int V = sr.nextInt();
    int B = sr.nextInt();
    int W = sr.nextInt();
    int T = sr.nextInt();
    int dis = Math.abs(B-A);
    if(W>=V)
      System.out.println("NO");
    else
      if((dis/(V-W))<=T)
        System.out.println("YES");
      else
        System.out.println("NO"); 
  }

}