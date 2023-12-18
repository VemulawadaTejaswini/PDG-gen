public class Main {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt(); // number of places
        int[] a = new int[n + 2];

        {
            int i = 0;
            a[i] = 0; // starting point
            for (i = 1; i <= n; ++i) {
                a[i] = sc.nextInt(); // place location
            }
            a[i] = 0; // To make calculations easier
        }

        long full = 0;
        for (int i = 0; i < n + 1; ++i) {
            full += Math.abs(a[i + 1] - a[i]);
        }

        for (int i = 1; i < n + 1; ++i) {
            long  distance = full;
            int s = a[i];
            int s0 = a[i - 1];
            int s1 = a[i + 1];
            if (!(s0 <= s && s <= s1)) {
                // If skip place is not in between previous and next
                // skipping will affect entire distance so recalculate affected part
                distance += (-Math.abs(s1 - s) - Math.abs(s - s0) + Math.abs(s1 - s0));
            }
            System.out.println(distance);
        }
    }
}
