import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        
        while (scan.hasNext()){
      double w=scan.nextDouble();		 
      if(w>91.00)System.out.println("heavy");
      else if(81.00<w&&w<=91.00)System.out.println("light heavy");
      else if(75.00<w&&w<=81.00)System.out.println("middle");
      else if(69.00<w&&w<=75.00)System.out.println("light middle");
      else if(64.00<w&&w<=69.00)System.out.println("welter");
      else if(60.00<w&&w<=64.00)System.out.println("light welter");
      else if(57.00<w&&w<=60.00)System.out.println("light");
      else if(54.00<w&&w<=57.00)System.out.println("feather");
      else if(51.00<w&&w<=54.00)System.out.println("bantam");
      else if(48.00<w&&w<=51.00)System.out.println("fly");
      else System.out.println("light fly");
      }
        }
      

}