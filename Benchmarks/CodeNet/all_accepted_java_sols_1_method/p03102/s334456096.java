public class Main {
    static java.util.Scanner scanner = new java.util.Scanner(System.in);
 
    public static void main(String[] args) {
        int n = scanner.nextInt(), m = scanner.nextInt(), c = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++)
            b[i] = scanner.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += (b[j] * scanner.nextInt());
            }
            sum += c;
            if (sum > 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}