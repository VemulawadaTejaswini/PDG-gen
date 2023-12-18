// ITP1_11_A Dice 1
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

         String instruction = br.readLine();
         for (int i = 0; i < instruction.length(); i++) {
            if (instruction.charAt(i) == 'N')
               dice.north();
            if (instruction.charAt(i) == 'E')
               dice.east();
            if (instruction.charAt(i) == 'W')
               dice.west();
            if (instruction.charAt(i) == 'S')
               dice.south();
         }

         System.out.println(dice.TOP);
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
      this.LEFT = left;
      this.BACK = back;
      this.FRONT = front;
      this.RIGHT = right;
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