import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        while(true) {
            boolean flg = true;
            for (int i = 0; i < a.length; i++) {
                if(a[i] % 2 != 0) {
                    flg = false;
                    break;
                } else {
                    a[i] /= 2;
                }
            }
            if(flg) {
                ans++;
            } else {
                break;
            }
        }
        System.out.println(ans);
    }
}