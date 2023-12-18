import java.util.Scanner;
   public class Main {
   public static void main(String[] args) {
     
        //sec--1 (definition)
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        
        //sec--2 (redefinition)
        N = N.substring(N.length() - 1);
         
        //sec--3 (branch)
        //if(N.equals(3)) {
        if(N.equals("2") || N.equals("4") || N.equals("5") || N.equals("7") || N.equals("9")) {
          System.out.println("hon");
        } else if (N.equals("0") || N.equals("1") || N.equals("6") || N.equals("8")) {
          System.out.println("pon");
        } else if (N.equals("3")) {
          System.out.println("bon");
        }
   }
}