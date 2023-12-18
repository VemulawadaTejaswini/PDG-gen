import java.util.Scanner;

/**
 *
 * @author k17075kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int d = x / y;
        int r =  x % y;
        double f = 1.0 * x / y;
        System.out.println(d+" "+r+" " + String.format("%.8f", f));
    }
}
