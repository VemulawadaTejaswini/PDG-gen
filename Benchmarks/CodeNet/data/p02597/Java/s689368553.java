import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char[] c = scanner.next().toCharArray();
        int white = 0;
        int red = 0;
        for(int i = 0; i < N; i++) {
            if(c[i] == 'W') white++;
            else red++;
        }
        int ret = 0;
        for(int i = 0; i < red; i++) {
            if(c[i] == 'W') ret++;
        }

        System.out.println(ret);
    }
}