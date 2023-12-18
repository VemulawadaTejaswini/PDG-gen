import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    long setCnt = N/(A+B);
    long r = N%(A+B);
    long br = Math.min(r,A);
    System.out.println(br+setCnt*A);
  }
  

  
}