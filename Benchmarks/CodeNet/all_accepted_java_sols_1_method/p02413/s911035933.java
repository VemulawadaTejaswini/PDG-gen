import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);
    int r=Integer.parseInt(scan.next());
    int c=Integer.parseInt(scan.next());
    int[][] array1=new int[r][c];
    for(int i=0;i<array1.length;i++){
      for(int j=0;j<array1[i].length;j++){
        array1[i][j]=Integer.parseInt(scan.next());
      }
    }

    int[][] array2=new int[r+1][c+1];
    for(int i=0;i<array2.length-1;i++){
      for(int j=0;j<array2[i].length-1;j++){
        array2[i][j]=array1[i][j];
      }
    }
    for(int i=0;i<array2.length-1;i++){
      for(int j=0;j<array2[i].length-1;j++){
        array2[i][c]+=array2[i][j];
      }
    }
    for(int i=0;i<c+1;i++){
      for(int j=0;j<r;j++){
        array2[r][i]+=array2[j][i];
      }
    }

    for(int i=0;i<r+1;i++){
      for(int j=0;j<c+1;j++){
        if(j<c){
          System.out.print(array2[i][j]+" ");
        }else{
          System.out.println(array2[i][j]);
        }
      }
    }
  }
}
