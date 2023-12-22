import java.util.*;

public class Main {
    public static int n = 0;
    public static int[] data = new int[100000];
    public static int q = 0;
    public static int[] targets = new int[50000];

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        n = num.nextInt();

        for(int i = 0; i < n; i++) {
            data[i] = num.nextInt();
        }

        q = num.nextInt();

        for(int i = 0; i < q; i++) {
            targets[i] = num.nextInt();
        }

        if(num != null) {
            num.close();
        }
        int result = 0;

        for(int i = 0; i < q; i++) {
            result += calc(0, n - 1, targets[i]);
        }

        System.out.println(result);
    }

    public static int calc(int left, int right, int target) {
        if(left > right) {
            return 0;
        }
        
        if(data[(left + right) / 2] == target) {
            return 1;
        } else if(data[(left + right) / 2] > target) {
            return calc(left, (left + right) / 2 - 1, target);
        } else {
            return calc((left + right) / 2 + 1, right, target);
        }
    }
}
