import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] dx={1,0,-1,0};
    int[] dy={0,1,0,-1};
    int n=sc.nextInt();
    int m=sc.nextInt();
    String[] a=new String[n];
    for(int i=0;i<n;i++){
      a[i]=sc.next();
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        if(a[i].charAt(j)=='#'){
          boolean f=false;
          for(int k=0;k<4;k++){
            if(i+dy[k]<0||n<=i+dy[k]||j+dx[k]<0||m<=j+dx[k]){
              continue;
            }
            if(a[i+dy[k]].charAt(j+dx[k])=='#'){
              f=true;
              break;
            }
          }
          if(!f){
            System.out.println("No");
            return;
          }
        }
      }
    }
    System.out.println("Yes");
  }
}