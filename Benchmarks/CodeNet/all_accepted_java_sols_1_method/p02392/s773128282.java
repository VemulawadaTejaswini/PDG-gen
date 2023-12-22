import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
      
        
        if (a < b&&a>=0 && b < c&&c<=100) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }
    }
}