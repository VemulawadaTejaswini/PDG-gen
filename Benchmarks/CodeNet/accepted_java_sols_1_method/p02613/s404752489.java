
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int[] a = new int[4];
        for (int i = 0; i < n; i++) {
            String s = scan.next();
            if (s.equals("AC")) {
                a[0]++;
            } else if (s.equals("WA")) {
                a[1]++;
            } else if (s.equals("TLE")) {
                a[2]++;
            } else {
                a[3]++;
            }
        }
        scan.close();

        System.out.println("AC x " + a[0]);
        System.out.println("WA x " + a[1]);
        System.out.println("TLE x " + a[2]);
        System.out.println("RE x " + a[3]);
    }
}
