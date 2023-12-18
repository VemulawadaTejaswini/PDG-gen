import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    int N,M,C,s,o,sum,cnt;
    int[][] A;
    int[] B;

    N=sc.nextInt();
    M=sc.nextInt();
    C=sc.nextInt();

    A=new int[N][M];
    B=new int[M];

    for(s=0;s<M;s++){
      B[s]=sc.nextInt();
    }

    for(s=0;s<N;s++){
      for(o=0;o<M;o++){
        A[s][o]=sc.nextInt();
      }
    }

    for(cnt=0,s=0;s<N;s++){
      for(sum=0,o=0;o<M;o++){
        sum+=A[s][o]*B[o];
      }
      if(sum+C>0){
        cnt++;
      }
    }

    System.out.println(cnt);

  }
}
