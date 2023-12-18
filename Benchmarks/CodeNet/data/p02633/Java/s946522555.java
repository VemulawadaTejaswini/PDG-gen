import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int sum = X;
        int count = 1;
        while(sum % 360 != 0) {
            sum += X;
            count++;
        }
        System.out.println(count);
    }
}
