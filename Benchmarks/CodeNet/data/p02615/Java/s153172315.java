import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    long A[]=new long[N];
    long ans =0;
    for(int i=0;i<N;i++){
      A[i]=sc.nextLong();}
    Arrays.sort(A);
    int n =N%2;
    int K =N/2;
    if(n==0){
      for(int j=K;j<N;j++){
        ans =ans+2*A[j];}
      ans =ans-A[N-1];}
    else{
      for(int k=K;k<N;k++){
        ans =ans +2*A[k];}
      ans =ans -A[N-1]-A[K];}
    System.out.println(ans);
  }
}