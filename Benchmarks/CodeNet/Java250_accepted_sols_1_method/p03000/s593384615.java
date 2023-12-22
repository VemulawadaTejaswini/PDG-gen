import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();

        int[] l = new int[n];
        int bound = 0;
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            bound += scan.nextInt();
            if (bound > x) {
                break;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
