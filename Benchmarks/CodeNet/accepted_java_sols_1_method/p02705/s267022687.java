import java.util.Scanner;
 
public class Main {
  
  private static double p = 2 * Math.PI;
 
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int r = in.nextInt();
        
      in.close();
      
      System.out.println(p * r);
    }
}