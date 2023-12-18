import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
   String s =input.nextLine();
   if (s.equals("Sunny") ){
       System.out.println("Cloudy");
   }
   else if(s.equals("Cloudy")){
        System.out.println("Rainy");
   }
   else if(s.equals("Rainy")){
       System.out.println("Sunny");
   }
    }
    
}