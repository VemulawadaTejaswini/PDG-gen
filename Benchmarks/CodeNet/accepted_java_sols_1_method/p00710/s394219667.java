import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, r, i, j;
        while((n = scan.nextInt()) != 0 && (r = scan.nextInt()) != 0) {
            int data[] = new int[n];
            for(i = 0; i < n; i++) {
                data[i] = n - i;
            }
            for(i = 0; i < r; i++) {
                int p = scan.nextInt();
                int c = scan.nextInt();

                int subData[] = new int[n];
                for(j = 0; j < c; j++) {
                    subData[j] = data[p + j - 1];
                }
                for(j = 0; j < p - 1; j++) {
                    subData[c + j] = data[j];
                }
                for(j = 0; j < n + 1 - p - c; j++) {
                    subData[c + p - 1 + j] = data[c + p - 1 + j];
                }

                for(j = 0; j < n; j++) {
                    data[j] = subData[j];
                }
            }
            System.out.println(data[0]);
        }
    }
}
