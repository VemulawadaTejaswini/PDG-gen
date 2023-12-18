import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[][] bingo = new int[3][3];
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        bingo[i][j] = sc.nextInt();
      }
    }
    int n = sc.nextInt();
    for(int i = 0; i < n; i++){
      int check = sc.nextInt();
      boolean flag = false;
      for(int j = 0; j < 3; j++){
        for(int k = 0; k < 3; k++){
          if(bingo[j][k] == check){
            bingo[j][k] = -1;
            flag = true;
            break;
          }
        }
        if(flag){
          break;
        }
      }
    }
    if((bingo[0][0] == -1&&bingo[0][1]==-1&&bingo[0][2]==-1)||(bingo[1][0]==-1&&bingo[1][1]==-1&&bingo[1][2]==-1)||(bingo[2][0]==-1&&bingo[2][1]==-1&&bingo[2][2]==-1)){
      System.out.println("Yes");
      return;
    }
    if((bingo[0][0]==-1&&bingo[1][0]==-1&&bingo[2][0]==-1)||(bingo[0][1]==-1&&bingo[1][1]==-1&&bingo[2][1]==-1)||(bingo[0][2]==-1&&bingo[1][2]==-1&&bingo[2][2]==-1)){
      System.out.println("Yes");
      return;
    }
    if((bingo[0][0]==-1&&bingo[1][1]==-1&bingo[2][2]==-1)||(bingo[0][2]==-1&&bingo[1][1]==-1&&bingo[2][0]==-1)){
      System.out.println("Yes");
      return;
    }
    System.out.println("No");
  }
}