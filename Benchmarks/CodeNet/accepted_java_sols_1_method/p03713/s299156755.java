public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        long h = scanner.nextInt(), w = scanner.nextInt();
        long size1, size2, size3, ans = Integer.MAX_VALUE;

        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < h; j++) {
                size1 = j * w;
                size2 = (h - j) * (w / 2);
                size3 = (h - j) * (w - (w / 2));
                ans = Math.min(ans, Math.max(Math.max(size1, size2), size3) - Math.min(Math.min(size1, size2), size3));

                size2 = (h - j) / 2 * w;
                size3 = (h - j - ((h - j) / 2)) * w;
                ans = Math.min(ans, Math.max(Math.max(size1, size2), size3) - Math.min(Math.min(size1, size2), size3));
            }

            long t = w;
            w = h;
            h = t;
        }

        System.out.println(ans);
    }
}