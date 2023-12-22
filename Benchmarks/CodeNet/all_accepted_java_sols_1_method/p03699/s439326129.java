import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int notMul10Num = 101;
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;
            if(num % 10 != 0) {
                notMul10Num = Math.min(notMul10Num, num);
            }
        }
        if(sum % 10 != 0) {
            System.out.println(sum);
        } else if (notMul10Num != 101) {
            System.out.println(sum - notMul10Num);
        } else {
            System.out.println(0);
        }
    }
}
