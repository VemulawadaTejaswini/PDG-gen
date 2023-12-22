import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int taxi_fee = sc.nextInt();
        int train_fee = N*A;
        if (taxi_fee > train_fee) {
            System.out.println(train_fee);
        } else {
            System.out.println(taxi_fee);
        }
    }
}
