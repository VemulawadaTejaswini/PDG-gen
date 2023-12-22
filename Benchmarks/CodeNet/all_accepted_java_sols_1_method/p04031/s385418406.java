import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for (int i = -100; i < 101; i++) {
            int tmp = 0;
            for(int b :a){
                tmp += Math.pow(i - b, 2);
            }
            ans = Math.min(ans, tmp);
        }

        System.out.println(ans);
        sc.close();
    }

}