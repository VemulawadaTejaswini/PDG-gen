import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int H =sc.nextInt();
    int W =sc.nextInt();
    int M =sc.nextInt();
    int A[]=new int[M];
    int B[] =new int[M];
    int C[] =new int[H];
    int D[] =new int[W];
    int E[] =new int[H];
    int F[] =new int[W];
    for(int i=0;i<M;i++){
      A[i]=sc.nextInt();
      B[i]=sc.nextInt();
      C[A[i]-1]=C[A[i]-1]+1;
      D[B[i]-1]=D[B[i]-1]+1;
      E[A[i]-1]=C[A[i]-1];
      F[B[i]-1]=D[B[i]-1];}
    Arrays.sort(C);
    Arrays.sort(D);
    long r =C[H-1]+D[W-1];
    long s=0;
    long t =0;
    for(int j=0;j<M;j++){
      s=E[A[j]-1]+F[B[j]-1];
      t =Math.max(t,s);
    }
    if(t==r){System.out.println(r-1);}
    else{System.out.println(r);}
  }
}