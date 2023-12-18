import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long t =1000000007;
    int N =sc.nextInt();
    long A[] =new long[N];
    long a=0;
    long b=0;
    long c =0;
    for(int i=0;i<N;i++){
      A[i] =sc.nextLong();
      A[i] =A[i]%t;
      a =a+A[i];
      a=a%t;
      b = A[i]*A[i];
      b =b%t;
      c =c+b;
      c =c%t;}
    long d =(a*a)%t;
    long e =d-c;
    e =e%t;
    if(e<0){e =e+t;}
    if(e%2==1){e =e+t;}
    e =e/2;
    System.out.println(e);
  }
}    
