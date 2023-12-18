public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        for (int i = 0, lastT = 0, lastX = 0, lastY = 0; i < n; i++) {
            int t = scanner.nextInt(), x = scanner.nextInt(), y = scanner.nextInt();

            int distance = Math.abs(x - lastX) + Math.abs(y - lastY);
            int j = distance - (t - lastT);
            if (j >= 1 || j % 2 == -1) {
                System.out.println("No");
                return;
            }

            lastT = t;
            lastX = x;
            lastY = y;
        }
        System.out.println("Yes");
    }
}