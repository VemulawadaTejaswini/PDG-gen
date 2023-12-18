import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    int n=s.length();
    int l=70;
    int[][] next=new int[l+1][n];
    for(int i=0;i<n;i++){
      next[0][i]=i+(s.charAt(i)=='L'?-1:1);
    }
    for(int i=1;i<=70;i++){
      for(int j=0;j<n;j++){
        next[i][j]=next[i-1][next[i-1][j]];
      }
    }
    int[] ans=new int[n];
    for(int i=0;i<n;i++){
      ans[next[l][i]]++;
    }
    for(int i=0;i<n-1;i++){
      System.out.print(ans[i]+" ");
    }
    System.out.println(ans[n-1]);
  }
}