import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N=sc.nextInt();
    int A[] = new int[N];
    int B[] = new int[N+1];
    B[0] =0;
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
      B[i+1]=B[i]+A[i];}
    int C =10*B[N]/N;
    int D =B[N]/N;
    int x=D;int y=0;int z;
    if(C>D*10+5){z=x+1;}else{z=x;}
    for(int j=0;j<N;j++){
      y=y+(A[j]-z)*(A[j]-z);}
    System.out.println(y);
  }
}