import java.util.*;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int gozenn = scan.nextInt();
        int gogo = scan.nextInt();
        
        while (gozenn != 0 || gogo != 0) {
            int hikaku = 0;
        int best = 0;
            for (int i = 0; i < 5; i++) {
                int kazu = gozenn + gogo;
                if (hikaku < kazu) {
                    hikaku = kazu;
                    best = i;
                }
                gozenn = scan.nextInt();
                gogo = scan.nextInt();
            }
            System.out.println((char)('A' + best) + " " + hikaku);
        }
    }
}

