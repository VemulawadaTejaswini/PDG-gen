// ITP1_11_B Dice 2
import java.io.*;

public class Main {
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Dice dice;

      try {
         String[] input = br.readLine().split(" ");
         int[] roll = new int[input.length];
         for (int i = 0; i < input.length; i++)
            roll[i] = Integer.parseInt(input[i]);
         dice = new Dice(roll[0], roll[1], roll[2], roll[3], roll[4], roll[5]);

         int q = Integer.parseInt(br.readLine());
         for (int i = 0; i < q; i++) {
            input = br.readLine().split(" ");
            int[] question = new int[2];
            question[0] = Integer.parseInt(input[0]);
            question[1] = Integer.parseInt(input[1]);
            if (question[0] != dice.TOP) {
               if ((question[0] == dice.RIGHT) || (question[0] == dice.LEFT))
                  while (question[0] != dice.TOP)
                     dice.east();
               else
                  while (question[0] != dice.TOP)
                     dice.north();
            }
            if (question[1] != dice.FRONT) {
               if (question[1] == dice.RIGHT)
                  System.out.println(dice.BACK);
               else if (question[1] == dice.BACK)
                  System.out.println(dice.LEFT);
               else if (question[1] == dice.LEFT)
                  System.out.println(dice.FRONT);
            } else
                  System.out.println(dice.RIGHT);
         }
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
      this.TOP = top;
      this.FRONT = front;
      this.RIGHT = right;
      this.LEFT = left;
      this.BACK = back;
      this.BOTTOM = bottom;
   }

   static void north() {
      work = TOP;
      TOP = FRONT;
      FRONT = BOTTOM;
      BOTTOM = BACK;
      BACK = work;
   }
   static void east() {
      work = TOP;
      TOP = LEFT;
      LEFT = BOTTOM;
      BOTTOM = RIGHT;
      RIGHT = work;
   }
   static void west() {
      work = TOP;
      TOP = RIGHT;
      RIGHT = BOTTOM;
      BOTTOM = LEFT;
      LEFT = work;
   }
   static void south() {
      work = TOP;
      TOP = BACK;
      BACK = BOTTOM;
      BOTTOM = FRONT;
      FRONT = work;
   }
}