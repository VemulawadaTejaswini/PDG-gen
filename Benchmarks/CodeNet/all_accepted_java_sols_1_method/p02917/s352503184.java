import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    int[] A=new int[N];
    int[] B=new int[N-1];
    int ans=0;
    for(int i=0;i<N-1;i++){
      B[i]=scan.nextInt();
    }
    A[0]=B[0];
    for(int i=0;i<N-2;i++){
      if(B[i]<B[i+1]){
        A[i+1]=B[i];
      }else{
        A[i+1]=B[i+1];
      }
    }
    A[N-1]=B[N-2];
    for(int i=0;i<N;i++){
      ans+=A[i];
    }
    System.out.println(ans);
  }
}