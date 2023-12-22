import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long N =sc.nextLong();
    long A =sc.nextLong();
    long B =sc.nextLong();
    long S =N%(A+B);
    long M =(N-S)/(A+B);
    if(S<=A){System.out.println(M*A+S);}
    else{System.out.println((M+1)*A);}
  }
}