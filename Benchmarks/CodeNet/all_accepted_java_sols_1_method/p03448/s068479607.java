import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(); // 500
        int B = scanner.nextInt(); // 100
        int C = scanner.nextInt(); // 50
        int X = scanner.nextInt();
        int count = 0;
        for (int i1 = 0; i1 <= C; i1++) {
            for (int i2 = 0; i2 <= B; i2++) {
                for (int i3 = 0; i3 <= A; i3++) {
                    if (50 * i1 + 100 * i2 + 500 * i3 == X) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
