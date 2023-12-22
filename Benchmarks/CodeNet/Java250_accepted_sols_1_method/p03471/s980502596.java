import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        int otoshidama = sc.nextInt();

        int x = -1;
        int y = -1;
        int z = -1;

        boolean isFinish = false;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (n - i - j >= 0 && i + j + (n - i - j) == n) {
                    if (i * 10000 + j * 5000 + (n - i - j) * 1000 == otoshidama) {
                        x = i;
                        y = j;
                        z = n - i - j;
                        isFinish = true;
                        break;
                    } else if(n - i - j < 0) {
                        break;
                    }
                }
            }
            if (isFinish) {
                break;

            }
        }
        System.out.println(x + " " + y + " " + z);
    }
}