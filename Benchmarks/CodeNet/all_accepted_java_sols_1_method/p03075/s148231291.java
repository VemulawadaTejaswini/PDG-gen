import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int[] antenna = new int[5];
        for (int i = 0; i < 5; i++) {
            antenna[i] = Integer.parseInt(sc.next());
        }
        int k = Integer.parseInt(sc.next());

        boolean result = true;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (Math.abs(antenna[i] - antenna[j]) > k) {
                    result = false;
                    break;
                }
            }
            if (result == false) {
                break;
            }
        }
        if (result) {
            out.printf("Yay!\n");
        } else {
            out.printf(":(\n");
        }
        out.flush();
    }
}
