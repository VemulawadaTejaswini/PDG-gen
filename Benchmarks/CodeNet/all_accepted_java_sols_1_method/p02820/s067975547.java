import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        int p = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        long total = 0;
        for (int i = 0; i < n; i++) {
            char x = 'a';
            if (i - k >= 0) {
                x = arr[i - k];
            }
            if (arr[i] == 'r') {
                if (x != 'r') {
                    total += p;
                } else {
                    arr[i] = 'x';
                }
            } else if (arr[i] == 's') {
                if (x != 's') {
                    total += r;
                } else {
                    arr[i] = 'x';
                }
            } else {
                if (x != 'p') {
                    total += s;
                } else {
                    arr[i] = 'x';
                }
            }
        }
        System.out.println(total);
    }
}
