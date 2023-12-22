import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        boolean[] sunuke = new boolean[n];

        for (int i = 0; i < k; i++) {
            int d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                int a = sc.nextInt();
                sunuke[a - 1] = true;
            }
        }

        int ans = 0;

        for (boolean b : sunuke) {
            if (!b) {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}
