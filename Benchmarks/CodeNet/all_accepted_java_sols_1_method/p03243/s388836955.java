import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 標準入力を受け取る
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // Nが111の倍数となるまで1を足し続ける
        while (N % 111 != 0){
            N++;
        }

        // 全ての桁の数が等しくなったNを標準出力
        System.out.println(N);

    }

}