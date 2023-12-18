import java.util.*;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String[] tmp = scan.nextLine().split("\\B");
            int n = 10;
            int[] ns = new int[n];
            for (int i = 0; i < n; i++)
                ns[i] = Integer.parseInt(tmp[i]);
            while (n != 0) {
                n--;
                for (int i = 0; i < n; i++) {
                    ns[i] = (ns[i] + ns[i + 1]) % 10;
                }
            }
            System.out.println(ns[0]);
        }

    }
}