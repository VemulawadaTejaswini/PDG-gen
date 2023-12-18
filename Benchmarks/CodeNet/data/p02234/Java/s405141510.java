import java.io.*;
import java.util.*;

class Main{
  static int n;
  static int[][] m;
  static int[] P;
  public static void main(String[] args){
    int i, j;
    int X[] = new int[2];
    try{
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      String s;
      s = bf.readLine();
      n = Integer.parseInt(s);
      m = new int[n+1][n+1];
      P = new int[n+1];
      StringTokenizer S;
      for( i=1 ; i<=n ; i++){
        S = new StringTokenizer(bf.readLine());
        for(j=0 ; j<2 ; j++){
        X[j] = Integer.parseInt(S.nextToken());
        }
        if(i == 1){
          P[0] = X[0];
          P[1] = X[1];
        }
        else{P[i] = X[1];}
        }
    }
    catch(IOException e){
      System.out.println(e);
    }
    matrixChainOrder(P);
  }

  static void matrixChainOrder(int p[]){
    int i, j=0, k, l, q;
    n = p.length-1;
    for(i=1 ; i<=n ; i++){
      m[i][i] = 0;
    }
    for(l=2 ; l<=n ; l++){
      for(i=1 ; i<=n-l+1 ; i++){
        j = i+l-1;
        m[i][j] = 2147483647;
        for(k=i ; k<=j-1 ; k++){
          q = m[i][k] + m[k+1][j] +p[i-1]*p[k]*p[j];
          m[i][j] = min(m[i][j], q);
        }
      }
    }
    /*for(i=1;i<=6;i++){
      for(j=1;j<=6;j++){
      System.out.println(m[i][j]);
        }
  }*/

//System.out.println("i="+i+"j="+j);
    System.out.println(m[i-1][j]);
  }

  static int min(int m, int q){
    if(m < q)return m;
    else return q;
  }
}

