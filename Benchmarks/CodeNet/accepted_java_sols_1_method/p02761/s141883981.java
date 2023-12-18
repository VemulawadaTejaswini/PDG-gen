import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] a=new int[n];
    Arrays.fill(a,-1);
    for(int i=0;i<m;i++){
      int s=sc.nextInt();
      int c=sc.nextInt();
      if(a[s-1]!=-1&&a[s-1]!=c){
        System.out.println(-1);
        return;
      }else{
        a[s-1]=c;
      }
    }
    if(n==1){
      if(a[0]==-1){
        a[0]=0;
      }
      System.out.println(a[0]);
    }else{
      if(a[0]==0){
        System.out.println(-1);
        return;
      }
      if(a[0]==-1){
        a[0]=1;
      }
      if(n>1&&a[1]==-1){
        a[1]=0;
      }
      if(n>2&&a[2]==-1){
        a[2]=0;
      }
      int ans=0;
      for(int i=0;i<n;i++){
        ans*=10;
        ans+=a[i];
      }
      System.out.println(ans);
    }
  }
}