import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      while(sc.hasNext()) {
         double wgt = Double.parseDouble(sc.nextLine());
         
         String opt;
         
         if(wgt <= 48.00) {
            opt = "light fly";
         } else if (wgt <= 51.00) {
            opt = "fly";
         } else if (wgt <= 54.00) {
            opt = "bantam";
         } else if (wgt <= 57.00) {
            opt = "feather";
         } else if (wgt <= 60.00) {
            opt = "light";
         } else if (wgt <= 64.00) {
            opt = "light welter";
         } else if (wgt <= 69.00) {
            opt = "welter";
         } else if (wgt <= 75.00) {
            opt = "light middle";
         } else if (wgt <= 81.00) {
            opt = "middle";
         } else if (wgt <= 91.00) {
            opt = "light heavy";
         } else {
            opt = "heavy";
         }
         
         System.out.println(opt);
      }
   }
}

