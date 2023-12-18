import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int M[] =new int[N];
    int L[] =new int[100000];
    long ans =0;
    for(int i=0;i<N;i++){
      M[i]=sc.nextInt();
      ans =ans +M[i];
      L[M[i]-1]=L[M[i]-1]+1;}
    int Q =sc.nextInt();
    int B[] =new int[Q];
    int C[] =new int[Q];
    for(int j=0;j<Q;j++){
      B[j]=sc.nextInt();
      C[j]=sc.nextInt();
      ans =ans+(C[j]-B[j])*L[B[j]-1];
      L[C[j]-1]=L[C[j]-1]+L[B[j]-1];
      System.out.println(ans);
    }
  }
}