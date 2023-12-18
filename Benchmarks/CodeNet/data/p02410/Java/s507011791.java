import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int n=Integer.parseInt(scan.next());
    int m=Integer.parseInt(scan.next());
    int[][] A=new int[n][m];
    int[] b=new int[m];
    for(int i=0;i<A.length;i++){
      for(int j=0;j<A[i].length;j++){
        A[i][j]=Integer.parseInt(scan.next());
      }
    }
    for(int i=0;i<b.length;i++){
      b[i]=Integer.parseInt(scan.next());
    }
    int[] c=new int[n];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
          c[i]+=A[i][j]*b[j];
      }
    }
    for(int i=0;i<n;i++){
      System.out.println(c[i]);
    }
  }
}
