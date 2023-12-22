import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String N = scan.next();
        int n = Integer.parseInt(N);

        int n1 = n % 10;

        if (n1 == 3) {
          System.out.println("bon");
        } else if (n1 == 0 || n1 == 1 || n1 == 6 || n1 == 8 ) {
          System.out.println("pon");
        } else {
          System.out.println("hon");
        }
    }
}