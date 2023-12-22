import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int num = 1;
        for (int i = 0; i < N; i++){
            int plus = num + K;
            int mul = num * 2;
            if (plus > mul){
                num = mul;
            } else {
                num = plus;
            }
        }
        System.out.println(num);
    }
}