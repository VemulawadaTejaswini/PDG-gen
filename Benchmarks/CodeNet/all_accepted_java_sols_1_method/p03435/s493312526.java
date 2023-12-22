import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      int A = 0;
      int B = 0;
      int C;

      int[][] Card = new int[3][3];
      for(int i = 0; i < 3; i++){
          for(int j = 0; j < 3; j++){
              Card[i][j] = scan.nextInt();
              }
          }
      A = Card[0][0] - Card[0][1];
      B = Card[0][0] - Card[0][2];
      C = Card[0][1] - Card[0][2];

      for(int i = 1; i < 3; i++){
          if(A != Card[i][0] - Card[i][1] || B != Card[i][0] - Card[i][2] || C != Card[i][1] - Card[i][2]){
             System.out.println("No");
             return;
             }
          }

      System.out.println("Yes");
   }
}
