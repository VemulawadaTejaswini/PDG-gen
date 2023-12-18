

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] l = new int[n];
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            if (max < l[i]) {
                max = l[i];
            }
            sum += l[i];
        }
        if (sum - max > max) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
