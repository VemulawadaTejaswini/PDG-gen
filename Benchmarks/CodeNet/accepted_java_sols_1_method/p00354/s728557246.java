import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int day = Integer.parseInt(sc.nextLine());
      //since 9/9/17 is Saturday, 9/1/17 is Friday
      switch(day % 7) {
         case 1:
            System.out.println("fri");
            break;
         case 2:
            System.out.println("sat");
            break;
         case 3:
            System.out.println("sun");
            break;
         case 4:
            System.out.println("mon");
            break;
         case 5:
            System.out.println("tue");
            break;
         case 6:
            System.out.println("wed");
            break;
         case 0:
            System.out.println("thu");
            break;
      }
   }
}
