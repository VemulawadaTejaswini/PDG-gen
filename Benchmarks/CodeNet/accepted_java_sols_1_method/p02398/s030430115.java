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
        int z = sc.nextInt();
        for (int j = x; j <= y; j++) {
            if ((z % j) == 0) {
                i++;
            }
        }
        System.out.println(i);
    }
}
