import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int r = in.nextInt();
        
      in.close();
      
      System.out.println(2 * Math.PI * r);
    }
}