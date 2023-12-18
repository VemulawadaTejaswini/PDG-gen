import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = {a,b,c};
        Arrays.sort(arr);
        long ans = arr[0]+arr[1];
        ans += ((long) arr[2]) << k;
        System.out.println(ans);
    }
}