import java.util.*;

public class Main {
    public static void main(String[] args) {
        int x, y, z, e;
        int min;

        Scanner sc = new Scanner(System.in);
        while ((e = Integer.parseInt(sc.next())) != 0) {
            min = e;
            for (int i = 0; i * i * i <= e; i++) {
                for (int j = 0; j * j <= e; j++) {
                    x = e - i * i * i - j * j;
                    if (x < 0) continue;
                    if (x + i + j < min) {
                        min = x + i + j;
                    }
                }
            }
            System.out.println(min);
        }
    }
}

