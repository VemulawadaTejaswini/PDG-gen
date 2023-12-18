import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    long A[] =new long[N];
    long a=0;
    long b=0;
    long c =0;
    long t =0;
    for(int i=0;i<N;i++){
      A[i] =sc.nextLong();
      A[i] =A[i]%1000000007;
      a =a+A[i];
      a=a%1000000007;
      b = A[i]*A[i];
      b =b%1000000007;
      c =c+b;
      c =c%1000000007;}
    long d =(a*a)%1000000007;
    long e =d-c;
    e =e%100000007;
    if(e<0){e =e+1000000007;}
    if(e%2==1){e =e+1000000007;}
    e =e/2;
    System.out.println(e);
  }
}
      