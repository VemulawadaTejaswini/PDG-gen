import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Integer[] a=new Integer[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    boolean[] est=new boolean[1000000+1];
    int ple=-1;
    int ans=0;
    for(int i=0;i<n;i++){
      if(ple!=a[i]){
        if(!est[a[i]]){
          if(i+1>=n||a[i]!=a[i+1]){
            ans++;
          }
          for(int j=a[i];j<=1000000;j+=a[i]){
            est[j]=true;
          }
        }
      }
    }
    System.out.println(ans);
  }
}