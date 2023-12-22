import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    long A[] = new long[N+1];
    long B[] = new long[N+1];
    long C[] = new long[N+1];
    long D[] = new long[N+1];
    for(int i=0;i<N+1;i++){
      A[i] =sc.nextLong();}
    B[0]=sc.nextLong();
    C[0]=Math.max(B[0]-A[0],0);
    if(C[0]==0){D[0]=B[0];}
    else{D[0]=A[0];}
    for(int j=1;j<N+1;j++){
     if(j==N){B[j]=0;}
      else{B[j] =sc.nextLong();}
      if(C[j-1]<A[j]){
      C[j]=Math.max(B[j]-A[j]+C[j-1],0);}
      else{C[j]=B[j];}
      if(C[j]==0){if((j==N)&&(A[j]<C[j-1])){D[j]=D[j-1]+A[j];}else{
        D[j]=D[j-1]+C[j-1]+B[j];}}
      else{D[j]=D[j-1]+A[j];}}
    System.out.println(D[N]);
  }
}
