import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = 0;
        
        for (int i = 0; i < N; i++) {
            int a= scanner.nextInt();
            while (a % 2 == 0) {
                a /= 2;
                ans += 1;
            }
        }

        System.out.println(ans);
    }
}
