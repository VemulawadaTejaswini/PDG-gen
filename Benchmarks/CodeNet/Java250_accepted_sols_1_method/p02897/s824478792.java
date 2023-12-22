import java.util.Scanner;
 
public class Main {
    // Making a static main function
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int num = scanner.nextInt();
      
      if (num % 2 ==0) 
        System.out.println("0.5");
      else {
        System.out.println((float)((num / 2) + 1) / num);
      }     
    }
}
