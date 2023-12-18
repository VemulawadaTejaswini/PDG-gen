import java.util.*;
import java.math.*;
class Main{
  public static void main(String[] args){
    Scanner sr = new Scanner(System.in);
    int A = sr.nextInt();
    int V = sr.nextInt();
    int B = sr.nextInt();
    int W = sr.nextInt();
    int T = sr.nextInt();
    int dis = Math.abs(B-A);
    int C = V-W;
    if(C*T<dis){System.out.println("NO");}
    	else{System.out.println("YES");}
  }

}