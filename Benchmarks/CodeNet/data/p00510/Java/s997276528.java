import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), max = m;
        for (int i = 0; i < n; i++) {
            m += sc.nextInt() - sc.nextInt();
            if (m < 0) {
                max = 0;
                break;
            }
            max = Math.max(max, m);
        }
        System.out.println(max);
    }
}
