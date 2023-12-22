import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    long A[] =new long[N];
    double e =Math.pow(10,18);
    long f =(long) e;long l =1;
    for(int j=0;j<N;j++){
      A[j]=sc.nextLong();if(A[j]==0){System.out.println(0);System.exit(0);}}
    for(int i=0;i<N;i++){
      l=l*A[i];
      if(l>f||l<=0){System.out.println(-1);System.exit(0);}}
    System.out.println(l);
  }
}