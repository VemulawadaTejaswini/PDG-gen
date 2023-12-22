public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), dup = 1;
        boolean[] a = new boolean[100000];
        for (int i = 0, temp; i < n; i++)
            if (a[temp = scanner.nextInt()]) dup++;
            else a[temp] = true;
        System.out.println(n - dup / 2 * 2);
    }
}