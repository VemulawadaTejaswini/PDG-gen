import java.util.*;
import java.io.*;
class Main{
  static int k;
  public static final int N = 8;
  public static final int NOT_FREE = -1;
  public static final int FREE = 0;
  public static  boolean col[] = new boolean[N];
  public static int row[] = new int[N];
  public static boolean dpos[]= new boolean[2*N-1];
  public static boolean dneg[] = new boolean[2*N-1];

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    k = sc.nextInt();
    int r,c;
    Arrays.fill(row, -1);

    for(int i = 0; i<k; i++){
      r = sc.nextInt();
      c = sc.nextInt();
      row[r] = c;
      col[c] =  dpos[r+c] = dneg[r-c+N-1] = true;
    }

    putQueen(0);
  }

  static void putQueen(int i ){

    if(i == N){
      printBoard();
      return;
    }

    if(row[i] != -1){
      putQueen(i+1);
    }
    for(int j = 0; j<N; j++){
      if(row[i] != -1 || col[j]|| dpos[i+j] || dneg[i-j+N-1]){
        continue;
      }

      //put queen (i,j);
      row[i] = j;
      col[j] = dpos[i+j] = dneg[i-j+N-1] = true;
      //next row;
      putQueen(i+1);
      //remove queen (i,j)
      row[i] = -1;
      col[j] =  dpos[i+j] = dneg[i-j+N-1] = false;
    }
  }

  static void printBoard(){
    for(int i = 0; i<N; i++){
      for(int j = 0; j<N; j++){
        if(row[i] == j)System.out.print("Q");
        else System.out.print(".");
      }
      System.out.println("");
    }
  }
}
