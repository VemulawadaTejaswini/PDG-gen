import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] p = new int[N];
        for (int i = 0; i < N; i++) {
            p[i] = scan.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (p[i] != i + 1) {
                count++;
            }
        }
        if (count <= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scan.close();
    }
}