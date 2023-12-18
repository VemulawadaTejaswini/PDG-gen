import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(sc.next());
        double k = Double.parseDouble(sc.next());
        int a[] = new int[(int) n];
        for (int i = 0; i < n; i++) {
            a[1] = Integer.parseInt(sc.next());
        }
        sc.close();
        System.out.println((1 + (int) Math.ceil((n - k) / (k - 1))));
    }
}