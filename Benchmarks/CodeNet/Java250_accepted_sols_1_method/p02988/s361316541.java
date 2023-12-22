import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < p.length; i++) {
            p[i] = sc.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < p.length - 2; i++) {
            int min = p[i];
            int max = p[i];
            for (int j = i; j < i + 3; j++) {
                min = Math.min(min, p[j]);
                max = Math.max(max, p[j]);
            }
            if (p[i + 1] != min && p[i + 1] != max) {
                counter++;
            }
        }
        System.out.println(counter);
        sc.close();
    }
}