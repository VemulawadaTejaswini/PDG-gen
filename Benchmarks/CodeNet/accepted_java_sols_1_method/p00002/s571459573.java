
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = a + b;
            
            int f = 1;
            int e = c / 10;
            while (0 < e) {
                e = e / 10;
                f = f + 1;
            }
            
             System.out.println(f);
        }
      
    }
}

