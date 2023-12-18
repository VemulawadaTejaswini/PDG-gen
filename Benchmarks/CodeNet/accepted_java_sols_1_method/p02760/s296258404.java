import java.util.*;
public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[][] card = new int[3][3];
    boolean[][] cardflg = new boolean[3][3];
    boolean flag = false;
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        card[i][j] = sc.nextInt();
      }
    }
    int n = sc.nextInt();
    for(int k=0;k<n;k++){
      int num = sc.nextInt();
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
          if(num == card[i][j]){
            cardflg[i][j] = true;
          }
        }
      }
    }
    if(
      (cardflg[0][0] && cardflg[0][1] && cardflg[0][2])
      || (cardflg[1][0] && cardflg[1][1] && cardflg[1][2])
      || (cardflg[2][0] && cardflg[2][1] && cardflg[2][2])
      || (cardflg[0][0] && cardflg[1][0] && cardflg[2][0])
      || (cardflg[0][1] && cardflg[1][1] && cardflg[2][1])
      || (cardflg[0][2] && cardflg[1][2] && cardflg[2][2])
      || (cardflg[0][0] && cardflg[1][1] && cardflg[2][2])
      || (cardflg[2][0] && cardflg[1][1] && cardflg[0][2])
    ){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
	}
}