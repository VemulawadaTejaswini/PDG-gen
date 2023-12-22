import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    
    long C = A+B;
    long ansA = A*(N/C);
    long ansB = Math.min(N%C, A); 
    System.out.println(ansA + ansB);
  }
}