import java.util.*;
import java.io.*;

class Main{
  static int n=0;
  static int[][] A;
  static int[][] B;
  public static void main(String args[]){
    int i,j;
    Scanner scan = new Scanner(System.in);

    n = scan.nextInt();
    A = new int[n][50];
    B = new int[n+1][n+1];
    for(i=1;i<=n;i++){
      for(j=1;j<=n;j++){
        B[i][j] = 0;
      }
    }

for(i=0;i<n;i++){
  A[i][0] = scan.nextInt();
  A[i][1] = scan.nextInt();
  for(j=0;j<A[i][1];j++){
    A[i][j+2] = scan.nextInt();
  }
}
graph();
for(i=1;i<=n;i++){
  for(j=1;j<=n;j++){
    if(j==n){
      System.out.println(B[i][j]);
      break;
    }
    System.out.print(B[i][j]+" ");
  }
}
    }

static void graph(){
int i,j,k;

for(i=0;i<n;i++){
  for(j=0;j<A[i][1];j++){
    for(k=0;k<n;k++){
      if(A[i][j+2]==A[k][0]){
        B[i+1][k+1] = 1;
      }
    }
  }
}
}

}

