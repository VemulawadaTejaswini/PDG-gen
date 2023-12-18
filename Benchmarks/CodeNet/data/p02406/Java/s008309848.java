import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(bf.readLine());
            int x;
            for (int i = 1; i <= a; i++) {
                if (i % 3 == 0)
                    System.out.printf(" %d", i);
                else {
                    x = i;
                    do {
                        if (x % 10 == 3) {
                            System.out.printf(" %d", i);
                            break;
                        }
                        x /= 10;
                    } while (x != 0);
                }
            }
            System.out.print("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
