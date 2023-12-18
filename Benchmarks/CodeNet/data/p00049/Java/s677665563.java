import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int A = 0;
      int B = 0;
      int AB = 0;
      int O = 0;
      while(sc.hasNext()) {
         String[] input = sc.nextLine().split(",");
         String bt = input[1];
         
         switch(bt) {
            case "A":
               A ++;
               break;
            case "B":
               B ++;
               break;
            case "AB":
               AB ++;
               break;
            case "O":
               O ++;
               break;
         }
         
      }
      
      System.out.println(A);
      System.out.println(B);
      System.out.println(AB);
      System.out.println(O);
   }
}
