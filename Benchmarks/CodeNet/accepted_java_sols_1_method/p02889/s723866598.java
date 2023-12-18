import java.util.*;
public class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int M = sc.nextInt();
        long L = sc.nextLong();
        long[][] E = new long[N+1][N+1];
        for(int i=0;i<=N;i++){
          for(int j=i;j<=N;j++){
            E[i][j]=Long.MAX_VALUE/2 -1;
          }
        }
        for(int i=0;i<M;i++){
          int A = sc.nextInt();
          int B = sc.nextInt();
          E[Math.min(A,B)][Math.max(A,B)] = sc.nextLong();
        }
        long[][] Ed = E.clone();
        for(int k=0;k<=N;k++){
          for(int i=0;i<N;i++){
            for(int j=i+1;j<=N;j++){
              long compare = (k<j)?(k<i)?Ed[k][i]+Ed[k][j]:Ed[i][k]+Ed[k][j]:Ed[i][k]+Ed[j][k];
        	  Ed[i][j]=Math.min(Ed[i][j],compare);
            }
          }
        }
        for(int i=0;i<=N;i++){
          for(int j=i;j<=N;j++){
            Ed[i][j] = (Ed[i][j]>L)?1000000000:1;
          }
        }
        for(int k=0;k<=N;k++){
          for(int i=0;i<N;i++){
            for(int j=i+1;j<=N;j++){
              long compare = (k<j)?(k<i)?Ed[k][i]+Ed[k][j]:Ed[i][k]+Ed[k][j]:Ed[i][k]+Ed[j][k];
        	  Ed[i][j]=Math.min(Ed[i][j],compare);
            }
          }
        }
        int Q = sc.nextInt();
        for(int i=0;i<Q;i++){
          int s = sc.nextInt();
          int t = sc.nextInt();
          System.out.println((E[Math.min(s,t)][Math.max(s,t)]==1000000000)?-1:E[Math.min(s,t)][Math.max(s,t)]-1);
        }
    }
}
        