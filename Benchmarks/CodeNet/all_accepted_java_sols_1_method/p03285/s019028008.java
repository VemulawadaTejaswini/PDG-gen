import java.util.Scanner;

class Main {
    static final Scanner IN = new Scanner(System.in);
    static final int N = Integer.parseInt(IN.next());
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