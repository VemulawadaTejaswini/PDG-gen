import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int k = Integer.parseInt(scanner.next());
        int at = n - k;
        if (at > 0){
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(scanner.next());
            }
            Arrays.sort(a);
            long atc = 0;
            for (int i = 0; i < at; i++) {
                atc = atc + a[i];
            }
            System.out.println(atc);
        }else {
            System.out.println(0);
        }
    }
}