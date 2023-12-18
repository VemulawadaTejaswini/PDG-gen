
import java.util.*;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int tomo = scan.nextInt();
        int ktomo = scan.nextInt();
        int keki = 0;
        for (int i = 0; i < ktomo; i++) {
            int keki2 = scan.nextInt();
            keki = keki + keki2;
        }
        if (keki % (tomo + 1) == 0) {
            System.out.println(keki/(tomo + 1));
        } else { System.out.println((keki / (tomo + 1))+1);
            {
            }
        }
    }
}

