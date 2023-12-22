import java.util.Scanner;

class Main {
    final static Scanner IN = new Scanner(System.in);
    static int N = IN.nextInt();
    public static void main(String... args) {
        boolean flag = false;     
        for (int c = 0; c <= N; c += 4) {
            if ((N - c) % 7 == 0) {
                flag = true;
                break;
            }
        }
        System.out.println(flag ? "Yes" : "No");
    }
}