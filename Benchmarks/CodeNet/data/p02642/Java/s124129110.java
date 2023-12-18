import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    long A[] =new long[N];
    int x =-1;int ans =0;
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();}
    Arrays.sort(A);
    for(int j=0;j<N;j++){
      if(A[j]==A[0]){continue;}
      x=j;
      for(int k=0;k<j;k++){
      if(A[j]%A[k]==0){continue;}}
      if(x==j){ans =ans+1;x=-1;}}
    System.out.println(ans);
  }
}