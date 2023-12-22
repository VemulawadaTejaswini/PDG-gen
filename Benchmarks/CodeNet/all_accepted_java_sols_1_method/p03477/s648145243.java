import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     left = 0, right = 0;

      int[] array = new  int[4];
      for(int i = 0; i < 4; i++){
          array[i] = scan.nextInt();
          }
      left  += array[0] += array[1];
      right += array[2] += array[3];
      if(left - right == 0){
         System.out.println("Balanced");
         }
      else if(left - right > 0){
              System.out.println("Left");
              }
      else{
          System.out.println("Right");
          }
   }
}
