import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int K =sc.nextInt();
    int x=0;
    int y=0;
    int z =0;
    int w=N-1;
    long ans =1;
    int q=K%2;
    int Q =K/2;
    long R;long S;
    long A[] =new long[N];
    for(int i=0;i<N;i++){
      A[i]=sc.nextLong();
      if(A[i]<=0){x=x+1;}
      if(A[i]==0){y=y+1;}}
    Arrays.sort(A);
    if((q==1)&&(x==N)){
      if(y!=0){System.out.println(0);}
      else{
        for(int j=N-1;j>=N-K;j--){
          ans =ans*A[j];
          ans =ans%1000000007;}
        ans =ans+1000000007;
        System.out.println(ans);}
    }
    else if(x!=0){{
      for(int k=0;k<Q;k++){
          R =A[z]*A[z+1];
          S =A[w]*A[w-1];
          if(R>=S){
            ans =ans*R;
            if(ans<0){
              ans =ans%1000000007;
              ans =ans*(-1)+291172353;}
            else{ans =ans%1000000007;}
            z=z+2;}
          else{
            ans =ans*S;
            if(ans<0){ans =ans%1000000007;ans =ans*(-1)+291172353;}
            else{ans =ans%1000000007;}
            w=w-2;}
        }
      if(q==0){System.out.println(ans);}
      else{
        ans =ans*A[w];
        ans =ans%1000000007;
        System.out.println(ans);}
    }}
    else{
      for(int m=N-1;m>N-K;m--){
      ans =ans*A[m];
        if(ans<0){
              ans =ans%1000000007;
              ans =ans*(-1)+291172353;}
        else{ans =ans%1000000007;}
      }
      System.out.println(ans);
    }
  }
}
