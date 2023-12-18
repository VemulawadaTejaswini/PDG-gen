import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[][] s=new int[m][];
    for(int i=0;i<m;i++){
      int k=sc.nextInt();
      s[i]=new int[k];
      for(int j=0;j<k;j++){
        s[i][j]=sc.nextInt()-1;
      }
    }
    int[] p=new int[m];
    for(int i=0;i<m;i++){
      p[i]=sc.nextInt();
    }
    int ans=0;
    for(int b=0;b<1<<n;b++){
      boolean flag=true;
      for(int i=0;i<m;i++){
        int cnt=0;
        for(int j=0;j<s[i].length;j++){
          cnt+=(b&1<<s[i][j])==0?0:1;
        }
        if((cnt&1)==p[i]){
        }else{
          flag=false;
        }
      }
      if(flag){
        ans++;
      }
    }
    System.out.println(ans);
  }
}