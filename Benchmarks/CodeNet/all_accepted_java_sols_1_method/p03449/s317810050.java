
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[][] = new int[2][N];
    int S1[] = new int[N+1];
    int S2[] = new int[N+1];
    S1[0]=0;
    S2[0]=0;
    for(int i=0;i<=1;i++){
      for(int j=0;j<N;j++){
        A[i][j]=sc.nextInt();        
      }
    }
    for(int i=1;i<=N;i++){
      S1[i]=S1[i-1]+A[0][i-1];
    }
    for(int i=1;i<=N;i++){
      S2[i]=S2[i-1]+A[1][i-1];
    }
    int ans=0;
    for(int i=1;i<=N;i++){
      ans=Math.max(ans,S1[i]+S2[N]-S2[i-1]);
    }
    System.out.println(ans);
  }

  
}
