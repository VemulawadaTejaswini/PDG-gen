import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        long x = Long.parseLong(s.next());
        // double loggg = Math.log(5.0);

        for (long i = 1;;i++) {
            long expect5 = i*i*i*i*i - x;
            if (expect5 > 0) {
                for (long j = 1;;j++) {
                    if (j*j*j*j*j < expect5) {
                        continue;
                    } else if (j*j*j*j*j == expect5) {
                        System.out.println("" + i + " " + j);
                        return;
                    } else {
                        break;
                    }
                }
            } else if (expect5 < 0) {
                for (long j = -1;;j--) {
                    if (j*j*j*j*j > expect5) {
                        continue;
                    } else if (j*j*j*j*j == expect5) {
                        System.out.println("" + i + " " + j);
                        return;
                    } else {
                        break;
                    }
                }
            } else {
                System.out.println("" + i + " " + 0);
                return;
            }
        }
    }
}