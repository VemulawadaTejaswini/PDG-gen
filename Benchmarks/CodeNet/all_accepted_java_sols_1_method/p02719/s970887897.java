import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long N=sc.nextLong();
    long K=sc.nextLong();
    long min1=0;
    long min2=0;
    long kaisuu=(long)(N/K);
      min1=N-K*kaisuu;
      min2=K*(kaisuu+1)-N;
      
      
      if(min1<=min2) System.out.println(min1);
      else System.out.println(min2);
      return;
  }
}