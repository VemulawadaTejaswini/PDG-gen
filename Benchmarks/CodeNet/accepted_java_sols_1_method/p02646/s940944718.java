import java.util.*;
import java.math.*;
public class Main{
  public static void main(String[] args){
    Scanner sr = new Scanner(System.in);
    long A = sr.nextLong();
    long V = sr.nextLong();
    long B = sr.nextLong();
    long W = sr.nextLong();
    long T = sr.nextLong();
    
    long D = Math.abs(B-A);
    long S = V-W;
    if(S*T<D){System.out.println("NO");}
    	else{System.out.println("YES");}
  }

}