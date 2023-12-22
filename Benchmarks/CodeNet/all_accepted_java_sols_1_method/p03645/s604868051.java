import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    boolean[] one=new boolean[n];
    boolean[] enu=new boolean[n];
    for(int i=0;i<m;i++){
      int from=sc.nextInt()-1;
      int to=sc.nextInt()-1;
      if(from==0){
        one[to]=true;
      }else if(to==n-1){
        enu[from]=true;
      }
    }
    for(int i=0;i<n;i++){
      if(one[i]&&enu[i]){
        System.out.println("POSSIBLE");
        return;
      }
    }
    System.out.println("IMPOSSIBLE");
  }
}