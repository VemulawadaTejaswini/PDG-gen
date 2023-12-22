import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    int[][] wa=new int['z'-'a'+1][n+1];
    for(int i=0;i<n;i++){
      wa[s.charAt(i)-'a'][i+1]=1;
    }
    for(int i=0;i<n;i++){
      for(int j='a'-'a';j<='z'-'a';j++){
        wa[j][i+1]+=wa[j][i];
      }
    }
    int max=0;
    for(int i=0;i<n;i++){
      int cnt=0;
      for(int j='a'-'a';j<='z'-'a';j++){
        if(wa[j][i+1]>0&&wa[j][n]-wa[j][i+1]>0){
          cnt++;
        }
      }
      max=Math.max(cnt,max);
    }
    System.out.println(max);
  }
}