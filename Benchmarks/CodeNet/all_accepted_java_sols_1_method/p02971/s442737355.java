import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int key1 = 0;
        int val1 = 0;
        int val2 = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            if (a[i] > val1) {
                val2 = val1;
                key1 = i;
                val1 = a[i];
            } else if (a[i] > val2) {
                val2 = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (i == key1) {
                System.out.println(val2);
                continue;
            }
            System.out.println(val1);
        }
    }

}
