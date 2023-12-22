import java.util.*;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    boolean judge=true;
    int H = sc.nextInt();
    int W = sc.nextInt();
  char[][] board = new char[H+2][W+2];
  for(int i=0;i<H+2;i++){
  board[i][0]='.';
  board[i][W+1]='.';
  }
  for(int j=0;j<W+2;j++){
    board[0][j]='.';
    board[H+1][j]='.';
  }
  for(int i=1;i<H+1;i++){
    String line=sc.next();
    char[] carr = line.toCharArray();
    for(int j=1;j<W+1;j++){
      board[i][j]=carr[j-1];
    }
  }
outer:  for(int i=1;i<H+1;i++){
    for(int j=1;j<W+1;j++){
    if(board[i][j]=='#'){
      if(board[i-1][j]=='.'&&board[i+1][j]=='.'&&board[i][j-1]=='.'&&board[i][j+1]=='.'){
        judge=false;
        break outer;
      }
    }
    }
  }
  if(judge)
    System.out.print("Yes");
    else
    System.out.print("No");

  }
}
