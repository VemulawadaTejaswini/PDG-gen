import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int K = sc.nextInt();

        if(N % 2 == 0 && N / K >= 2){
            System.out.println("YES");
        } else if(N % 2 == 1 && (N + 1) / K >= 2){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
