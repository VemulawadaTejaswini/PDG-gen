import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] number = new long[n+1];
        number[0] = 2;
        number[1] = 1;
        for (int i=2;i<=n;i++){
            number[i] = number[i-1] + number[i-2];
        }
        System.out.println(number[n]);

    }

}