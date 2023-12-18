import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            int n =scanner.nextInt();
            int result = 0;
            int[] prime = new int[999999];
            
            if (n > 1) {
                prime[result++] = 2;
            }
            if (n > 2) {
                prime[result++] = 3;
            }

            for (int i = 5; i <= n; i += 2) {
                int j = 1;
                for (; j < result; j++) {
                    if (i%prime[j] == 0) {
                        break;
                    }
                }
                if (j == result) {
                    prime[result++] = i;
                }
            }
            System.out.println(result);
        }
    }
}