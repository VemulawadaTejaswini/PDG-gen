// ITP1_11_C Dice 3
import java.io.*;

public class Main {
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Dice[] dice = new Dice[2];

      try {
         String[][] input = new String[2][];
         for (int i = 0; i < 2; i++)
            input[i] = br.readLine().split(" ");
         int[][] roll = new int[2][6];
         for (int i = 0; i < roll.length; i++)
            for (int j = 0; j < input[i].length; j++)
               roll[i][j] = Integer.parseInt(input[i][j]);
         dice[0] = new Dice(roll[0][0], roll[0][1], roll[0][2], roll[0][3], roll[0][4], roll[0][5]);
         dice[1] = new Dice(roll[1][0], roll[1][1], roll[1][2], roll[1][3], roll[1][4], roll[1][5]);

         if (dice[1].TOP != dice[0].TOP) {
            if ((dice[1].RIGHT == dice[0].TOP) || (dice[1].LEFT == dice[0].TOP))
               while (dice[1].TOP == dice[0].TOP)
                  dice[1].east();
            else
               while (dice[1].TOP == dice[0].TOP)
                  dice[1].north();
         }
         if (dice[1].FRONT != dice[0].FRONT)
            while (dice[1].FRONT != dice[0].FRONT)
               dice[1].rspin();

         if ((dice[0].TOP    == dice[1].TOP)
          && (dice[0].FRONT  == dice[1].FRONT)
          && (dice[0].RIGHT  == dice[1].RIGHT)
          && (dice[0].LEFT   == dice[1].LEFT)
          && (dice[0].BACK   == dice[1].BACK)
          && (dice[0].BOTTOM == dice[1].BOTTOM))
            System.out.println("Yes");
         else
            System.out.println("No");
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }
}

class Dice {
   static int TOP;
   static int FRONT; 
   static int RIGHT;
   static int LEFT;
   static int BACK;
   static int BOTTOM;
   static int work;

   public Dice(int top, int front, int right, int left, int back, int bottom) {
      this.TOP    = top;
      this.LEFT   = left;
      this.BACK   = back;
      this.FRONT  = front;
      this.RIGHT  = right;
      this.BOTTOM = bottom;
   }

   static void north() {
      work   = TOP;
      TOP    = FRONT;
      FRONT  = BOTTOM;
      BOTTOM = BACK;
      BACK   = work;
   }
   static void east() {
      work   = TOP;
      TOP    = LEFT;
      LEFT   = BOTTOM;
      BOTTOM = RIGHT;
      RIGHT  = work;
   }
   static void west() {
      work   = TOP;
      TOP    = RIGHT;
      RIGHT  = BOTTOM;
      BOTTOM = LEFT;
      LEFT   = work;
   }
   static void south() {
      work   = TOP;
      TOP    = BACK;
      BACK   = BOTTOM;
      BOTTOM = FRONT;
      FRONT  = work;
   }
   static void rspin() {
      work  = FRONT;
      FRONT = RIGHT;
      RIGHT = BACK;
      BACK  = LEFT;
      LEFT  = work;
   }
   static void lspin() {
      work  = FRONT;
      FRONT = LEFT;
      LEFT  = BACK;
      BACK  = RIGHT;
      RIGHT = work;
   }
}