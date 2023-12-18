import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int M =sc.nextInt();
    long K =sc.nextLong();
    long A[] =new long[N+M];
    A[0]=sc.nextLong();
    A[N]=sc.nextLong();
    long k =K-A[0];
    int t=-1;
    for(int i=1;;i++){
      if(i<N){A[i]=A[i-1]+sc.nextLong();}
      else if(i==N){continue;}
      else if((i<N+M)&&(t==-1)){A[i]=A[i-1]+sc.nextLong();
                        if(A[i]>k){t=i-1;}}
      else{break;}}   
    if(t==-1){t=M-1;}
    int ans =0;
    for(int j=0;j<N;j++){
      for(int l=0;l<=t;l++){
        if(A[j]+A[t-l]<=K){ans =Math.max(ans,j+t-l+2);}}}
    System.out.println(ans);
  }
}