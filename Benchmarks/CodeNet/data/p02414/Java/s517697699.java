import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int n=Integer.parseInt(scan.next());
    int m=Integer.parseInt(scan.next());
    int l=Integer.parseInt(scan.next());
    long[][] arrayA=new long[n][m];
    for(int i=0;i<arrayA.length;i++){
      for(int j=0;j<arrayA[i].length;j++){
        arrayA[i][j]=Long.parseLong(scan.next());
      }
    }
    long[][] arrayB=new long[m][l];
    for(int i=0;i<arrayB.length;i++){
      for(int j=0;j<arrayB[i].length;j++){
        arrayB[i][j]=Long.parseLong(scan.next());
      }
    }

    long[][] arrayC=new long[n][l];
    for(int i=0;i<n;i++){
      for(int j=0;j<l;j++){
        for(int k=0;k<m;k++){
          arrayC[i][j]+=arrayA[i][k]*arrayB[k][j];
        }
      }
    }

    for(int i=0;i<arrayC.length;i++){
      for(int j=0;j<arrayC[i].length;j++){
        System.out.print(arrayC[i][j]);
        if(j<arrayC[i].length-1){
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
