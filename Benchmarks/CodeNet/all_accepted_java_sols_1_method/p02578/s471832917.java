import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    long A[] =new long[N];
    long ans =0;
    long t =0;
    for(int i=0;i<N;i++){
      A[i]=sc.nextLong();
      t=Math.max(t,A[i]);
      ans =ans +t-A[i];}
    System.out.println(ans);    
  }
}