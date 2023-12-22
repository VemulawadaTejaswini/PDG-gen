import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer a[] = new Integer[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, Comparator.reverseOrder());

        int Alice = 0;
        int Bob = 0;
        for (int i=0; i < n; i+=2) {
            Alice += a[i];
        }
        for (int i=1; i<n; i+=2) {
            Bob += a[i];
        }
        System.out.println(Alice-Bob);
        sc.close();
    }
}