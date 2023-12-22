import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        int min = 101;
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                if (i != j) total += Math.abs(a[i] - a[j]);
            }
            if (total < min) min = total;
        }
        System.out.println(min);
    }
}
