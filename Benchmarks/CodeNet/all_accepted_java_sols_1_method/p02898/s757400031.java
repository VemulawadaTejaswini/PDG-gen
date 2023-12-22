import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int n = scan.nextInt(), k = scan.nextInt();
        int man[] = new int[n];

        for (int i = 0; i < n; i++) man[i] = scan.nextInt();
        for (int tmp : man) if (tmp >= k) count++;

        System.out.println(count);
    }
}
