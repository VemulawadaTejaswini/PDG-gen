import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long A =sc.nextLong();
    long B=sc.nextLong();
    long K =sc.nextLong();
    long L =Math.max(A-K,0);
    long R;
    if(L==0){R =Math.max(B+A-K,0);}else{R =B;};
    System.out.println( L +" "+R );
  }
}