import java.util.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str;
      String[] arr;
      int n = Integer.parseInt(sc.nextLine());
      int[][][] status = new int[4][3][10];
      int building;
      int floor;
      int room;
      int v;
      
      
      //initialize "status"
      for(int i = 0; i < 4; i ++){
         for(int j = 0; j < 3; j++){
            for(int k = 0; k < 10; k ++){
               status[i][j][k] = 0;
            }
         }
      }
      
      for(int i = 0; i < n; i ++){
         str = sc.nextLine();
         arr = str.split(" ");
         building = Integer.parseInt(arr[0]);
         floor = Integer.parseInt(arr[1]);
         room = Integer.parseInt(arr[2]);
         v = Integer.parseInt(arr[3]);
         
         status[building-1][floor-1][room-1] += v;
      }
      
      for(int i = 0; i < 4; i ++){
         for(int j = 0; j < 3; j++){
            for(int k = 0; k < 10; k ++){
               System.out.print(" " + status[i][j][k]);
            }
            System.out.println();
         }
         if(i < 3) {
            System.out.println("####################");
         }
      }
   
   }//main
}//class