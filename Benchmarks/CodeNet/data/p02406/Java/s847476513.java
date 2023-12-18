import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        for (int i = 1; i <= n; i++) {
            if (i == n) {
                if (i % 3 == 0) {
                    System.out.println(" " + i);
                } else if (Integer.toString(i).contains("3")) {
                    System.out.println(" " + i);
                } else {
                    System.out.println();
                }
            } else {
              if (i % 3 == 0) {
                    System.out.print(" " + i);
                } else if (Integer.toString(i).contains("3")) {
                    System.out.print(" " + i);
                }
            }
        }
    }
}

