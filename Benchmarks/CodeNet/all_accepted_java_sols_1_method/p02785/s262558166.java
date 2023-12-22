import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int K =sc.nextInt();
    if(N<=K){System.out.println(0);}
    else{
    long M[] =new long[N];
    for(int i=0;i<N;i++){
      M[i]=sc.nextLong();}
    Arrays.sort(M);
    long x=0;
    for(int j=0;j<N-K;j++){
      x=x+M[j];}
    System.out.println(x);}
  }
}