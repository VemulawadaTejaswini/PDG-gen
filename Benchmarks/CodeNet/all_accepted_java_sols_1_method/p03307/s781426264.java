import java.util.*;
public class Main {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int num = 0;
        if ((N % 2) == 0) {
            num = N;
        } else {
            num = N * 2;
        }

        System.out.println(num);
    }
}