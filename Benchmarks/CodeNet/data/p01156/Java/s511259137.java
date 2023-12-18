import java.io.*;
import java.util.*;

public class Main {
    List<String> H = Arrays.asList("Rock", "Fire", "Scissors", "Snake", "Human", "Tree", "Wolf", "Sponge", "Paper", "Air", "Water", "Dragon", "Devil", "Lightning", "Gun");
    Scanner sc;
    Main() {
        sc = new Scanner(System.in);
    }
    public static void main(String[] args) {
        new Main().run();
    }
    int n;
    String[] hs;
    boolean init() {
        n = sc.nextInt();
        if (n == 0) return false;
        hs = new String[n];
        for (int i = 0; i < n; i++) {
            hs[i] = sc.next();
        }
        return true;
    }
    void run() {
        while (init()) {
            boolean end = false;
            for (int i = 0; i < n; i++) {
                boolean won = false;
                boolean defeated = false;
                for (int j = 0; j < n; j++) {
                    int a = H.indexOf(hs[i]);
                    int b = H.indexOf(hs[j]);
                    if (a == b) continue;
                    if ((a+15-b) % 15 <= 7) {
                        //System.out.println(hs[i] + " defeated by " + hs[j]);
                        defeated = true;
                    }
                    else if ((a+15-b) % 15 >= 8)
                        won = true;
                }
                if (won && (!defeated)) {
                    System.out.println(hs[i]);
                    end = true;
                    break;
                }
            }
            if (!end) {
                System.out.println("Draw");
            }
        }
    }
}