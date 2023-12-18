import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int X = sc.nextInt();
    int[] C = new int[N];
    int[][] A = new int[N][M];
    int ans = 0;
    for(int i=0;i<N;i++){
      C[i] = sc.nextInt();
      ans+=C[i];
      for(int j=0;j<M;j++){
        A[i][j] = sc.nextInt();
      }
    }
    boolean anscheck = false;
    for(int i=0;i<Math.pow(2,N);i++){
      int cost = 0;
      boolean levelcheck = true;
      int[] level = new int[M];
      for(int j=0;j<N;j++){
        if((1&i>>j)==1){
          cost+=C[j];
          for(int k=0;k<M;k++){
            level[k]+=A[j][k];
          }
        }
      }
      for(int l=0;l<M;l++){
        if(!(level[l]>=X)){
          levelcheck = false;
          break;
        }
      }
      if(levelcheck==true){
        ans = Math.min(ans,cost);
        anscheck = true;
      }
    } 
    if(anscheck){
      System.out.println(ans);
    }else{
      System.out.println(-1);
    }
  }
}
