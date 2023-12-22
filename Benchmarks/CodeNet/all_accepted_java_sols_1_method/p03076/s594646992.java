import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int count = 0;
        int[] f = new int[5];
        for (int i = 0; i < 10; i++) {
            if(a % 10 != 0) a++;
            else {
                f[0] = i;
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            if(b % 10 != 0) b++;
            else {
                f[1] = i;
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            if(c % 10 != 0) c++;
            else {
                f[2] = i;
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            if(d % 10 != 0) d++;
            else {
                f[3] = i;
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            if(e % 10 != 0) e++;
            else {
                f[4] = i;
                break;
            }
        }
        Arrays.sort(f);
        int max = f[4];
        int ans = a + b + c + d + e - max;
        System.out.println(ans);
    }
}