import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        Integer[] arr = new Integer[]{a, b, c, d, e};
        Arrays.sort(arr, (d1,d2) -> {
            int rem1 = d1 % 10;
            int rem2 = d2 % 10;
            if (rem1 == 0) rem1 += 10;
            if (rem2 == 0) rem2 += 10;
            return Integer.compare(rem2, rem1);
        });

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = (int) Math.ceil(sum / 10.0) * 10;
            sum += arr[i];
        }
        System.out.println(sum);
    }
}