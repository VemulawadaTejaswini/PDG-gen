import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean[] used = new boolean[1001];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            for (int j = start; j < end; j++) {
                used[j] = true;
            } 
        }
        int canUse = 0;
        for (int i = a; i < b; i++) {
            if (used[i]) {
                canUse = 1;
                break;
            }
        }
        System.out.println(canUse);
    }
}

