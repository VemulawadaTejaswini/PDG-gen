import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] people = new int[n];
        for (int i = 0; i < n; i++) {
            people[i] = sc.nextInt();
        }
        int ok = 0;
        for (int h : people) {
            ok += h >= k ? 1 : 0;
        }
        System.out.println(ok);
    }
}