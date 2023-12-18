import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int counter = 0;

        while (a <= b) {
            if(c % a == 0) {                                           
                counter += 1;
            }
            a += 1;
        }

        out.println(counter);
    }   
}