import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            int v = sc.nextInt();
            while (v % 2 == 0) {
                temp++;
                v /= 2;
            }
            ans = Math.min(ans, temp);
        }

        System.out.println(ans);
        sc.close();
    }
}
