import java.util.Scanner;

/**
 *
 * @author k16075kk
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            String s1 = sc.next();
            String s2 = sc.next();
            if (s1.compareTo(s2) > 0) {
                x += 3;
            } else if (s1.compareTo(s2) < 0) {
                y += 3;
            } else {
                x++;
                y++;
            }
        }
        System.out.println(x + " " + y);
    }

}

