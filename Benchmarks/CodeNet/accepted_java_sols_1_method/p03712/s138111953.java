import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int H = Integer.parseInt(S[0]);
    int W = Integer.parseInt(S[1]);
    char[][] pic = new char[H+2][W+2];
    String T = "";
    for(int i = 0; i < H+2; i++){
      if(!(i == 0 || i == H+1)){
        T = sc.nextLine();
      }
      for(int j = 0; j < W+2; j++){
        if(j == W+1){
          System.out.println("#");
        }else if(i == 0 || i == H+1 || j == 0){
          System.out.print("#");
        }else{
          System.out.print(T.charAt(j-1));
        }
      }
    }
  }
}