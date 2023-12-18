import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = 0;
            int c[] = new int[a + 1];
            if (a < 2) {
                System.out.println("0");
            } else {
                for (int i = 2; i <= a; i++) {
                    if (c[i] == 0) {
                        for (int j = i * 2; j <= a; j = j + i) {
                            c[j] = 1;


                        }
                    }
                }
                for (int i = 2; i <= a; i++) {
                    if (c[i] == 0)
                        b++;

                }
                System.out.println(b);
            }
        }
    }
}