import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long N =sc.nextLong(); 
    long A =sc.nextLong();
    long B =A+sc.nextLong();
    long m =N/B;
    long n=N%B;
    if(n<A){System.out.println(m*A+n);}
    else{System.out.println((m+1)*A);}
  }
}