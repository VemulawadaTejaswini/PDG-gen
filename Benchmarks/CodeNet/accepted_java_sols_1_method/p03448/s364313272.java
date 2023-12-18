import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());

        int result = 0;
        for (int i = 0; i <= A; i++) {
            for (int j = 0; j <= B; j++) {
                int c = (X - i * 500 - j * 100) / 50;
                if (c >= 0 && c <= C) result++;
            }
        }
        System.out.println(result);
    }
}