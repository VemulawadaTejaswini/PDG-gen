import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 標準入力を受け取る
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        // N以上である最小の111の倍数を探す
        for (int i = 1; i <= 9; i++) {
            if (N <= 111 * i) {
                // N以上である最小の111の倍数を標準出力
                System.out.println(111 * i);
                break; // これ以上探す必要がない
            }
        }

    }

}