import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    long A[] =new long[N];
    long B[] =new long[N];
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
      B[i]=sc.nextInt();}
    int n =N/2;
    Arrays.sort(A);
    Arrays.sort(B);
    if(N%2==1){
      System.out.println(B[n]-A[n]+1);}
    else{
      System.out.println(B[n]+B[n-1]-A[n]-A[n-1]+1);}
  }
}