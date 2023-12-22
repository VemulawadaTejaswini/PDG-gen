import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] h = new int[n];
        int[] curH = new int[n];
        
        for (int i = 0; i < n; i++) {
            h[i] = scanner.nextInt();
        }
        int count = 0;
        outer:
        while (true) {
            int start = 0, end = 0;
            for (start = 0; start < n; start++) {
                if (curH[start] < h[start]) {
                    break;
                }
            }
            if (start >= n) {
                break;
            }
            count++;
            int i;
            for (i = start; i < n; i++) {
                if (curH[i] < h[i]) {
                    curH[i]++;
                } else {
                    break;
                }
            }
        }
        
        System.out.println(count);
    }
}
