import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if (a[4] - a[0] > k) {
            System.out.println(":(");
        } else {
            System.out.println("Yay!");
        }
        sc.close();
    }
}