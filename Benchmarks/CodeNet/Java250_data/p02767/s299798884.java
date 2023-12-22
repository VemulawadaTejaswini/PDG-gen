import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i =0;i<n;i++) {
            a[i] = sc.nextInt();
            sum+=a[i];
        }

        int w = sum / n;
        int mod = sum % n;
        if (mod > n / 2) w++;

        int ans = 0;
        for (int i : a) {
            int abs = Math.abs(i - w);
            ans += abs * abs;
        }
        System.out.println(ans);
    }
}
