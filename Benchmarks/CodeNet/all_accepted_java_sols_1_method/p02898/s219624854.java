import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        int counter = 0;
        for (int i = 0; i < h.length; i++) {
            h[i] = sc.nextInt();
            if (h[i] >= k) {
                counter++;
            }
        }
        System.out.println(counter);
        sc.close();
    }
}