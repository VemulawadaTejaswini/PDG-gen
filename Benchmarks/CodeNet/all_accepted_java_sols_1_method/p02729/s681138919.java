import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i ++)
            sum += i;
        for (int j = 1; j < m; j ++)
            sum += j;
        System.out.println(sum);
    }

}
