import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0 ; i < n ; i++) {
            p[i] = sc.nextInt();
        }
        int min = 10000000;
        int count = 0;
        for (int i = 0 ; i < n ; i++) {
            if (p[i] < min) {
                count++;
                min = p[i];
            }
        }
        System.out.println(count);
    }

}
