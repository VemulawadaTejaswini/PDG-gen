
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        String c = scan.next();
        scan.close();

        int Rsum = 0;
        int Rcount = 0;
        for (int i = 0; i < n; i++) {
            if (c.charAt(i) == 'R') {
                Rsum++;
            }
        }
        for (int i = 0; i < Rsum; i++) {
            if (c.charAt(i) == 'R') {
                Rcount++;
            }
        }

        System.out.println(Rsum - Rcount);
    }
}
