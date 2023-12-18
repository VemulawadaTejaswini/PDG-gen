import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int K=sc.nextInt();
    int m[] =new int[N];
    int d[] =new int[K];
    int n;int x=0;
    for(int i=0;i<K;i++){
      d[i]=sc.nextInt();
      for(int j=0;j<d[i];j++){
        n=sc.nextInt();
        m[n-1]=m[n-1]+1;}
    }
    for(int l=0;l<N;l++){
      if(m[l]==0){x=x+1;}}
    System.out.println(x);
  }
}