import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long K = sc.nextLong();
        long D = sc.nextLong();
        long result = -1;


        if(Math.abs(X) % D == 0) {
            long temp = X / D;
            if(temp >= K) {
                result = Math.abs(X) - K * D;
            } else {
                K -= temp;
                if(K % 2 == 0) {
                    result = 0;
                } else {
                    result = D;
                }
            }
        } else {
            long temp = X / D;
            if(temp >= K) {
                result = Math.abs(X) - K * D;
            } else {
                K -= temp;
                result = Math.abs(X) - temp * D;
                if(K % 2 == 0) {
//                    result = ;
                } else {
                    result = Math.min(Math.abs(X - D), Math.abs(X + D));
                }
            }
        }

//        if(K % 2 == 0) {
//            long temp1 = X - 2 * D;
//            long temp2 = X + 2 * D;
//            result = Math.min(Math.abs(X), Math.min(Math.abs(temp1), Math.abs(temp2)));
//        } else {
//            long temp1 = X - D;
//            long temp2 = X + D;
//            result = Math.min(Math.abs(temp1), Math.abs(temp2));
//        }

        System.out.println(result);
    }
}
