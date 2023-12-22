import java.util.*;

class Main{
  public static int N;
  public static int[] A;
  public static int[] Check;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    A = new int[N];
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
    }
    int subR=N+1;
    Check = new int[N+1];
    for(int i = 0;i<N+1;i++){
      Check[i]=-1;
    }
    for(int i = 0;i<N;i++){
        if(A[i]==1){
          Check[1]=i;
          break;
        }
      }
    if(Check[1]!=-1){
    for(int checking=2;checking<=N;checking++){
      for(int i = Check[checking-1]+1;i<N;i++){
        if(A[i]==checking){
          Check[checking]=i;
          break;
        }
      }
      if(Check[checking]==-1){
        break;
      }
    }
  }
    for(int i = 0;i<N+1;i++){
      if(Check[i]!=-1){
        subR=i;
      }
    }
    System.out.println(N-subR);
  }
}