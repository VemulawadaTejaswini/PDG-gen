

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            a[i] = sc.nextInt();
        }
        int slow = a[1];
        boolean[] checked = new boolean[n + 1];
        int count = 1;
        while (!checked[slow]) {
            if (slow == 2) {
                System.out.println(count);
                return;
            }
            count++;
            checked[slow] = true;
            slow = a[slow];
        }
        System.out.println(-1);
    }
}
