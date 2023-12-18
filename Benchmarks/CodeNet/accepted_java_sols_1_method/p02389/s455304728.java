import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a*b + " " + 2*(a+b));
    }
}

