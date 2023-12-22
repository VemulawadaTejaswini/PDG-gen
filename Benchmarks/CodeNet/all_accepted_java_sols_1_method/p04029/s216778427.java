import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        
      int i = scan.nextInt();
      int ans = i * (i + 1) / 2;
      
      System.out.println(ans); 
    }
}