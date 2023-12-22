import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int k = sc.nextInt();
        // スペース区切りの整数の入力
        int x = sc.nextInt();
        // 結果の出力
        int min = x - (k - 1);
        int max = x + (k - 1);

        for(int i = min; i <= max; i++){
            System.out.print(i);
            if(i != max) {
                System.out.print(" ");
            }
        }
    }
}
