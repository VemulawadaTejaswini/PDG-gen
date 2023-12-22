import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        String[] S = new String[N];
        for(int i = 0; i < N; i++) {
            S[i] = scanner.next();
        }
        Arrays.sort(S);
        for(int i = 0; i < N; i++) {
            System.out.print(S[i]);
        }
    }
}