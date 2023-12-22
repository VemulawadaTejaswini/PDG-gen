import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int cnt = 0;
        for (int i = 10000 ; i <= 99999 ; i++) {
            if (i >= A && i <= B) {
                int [] a = new int[5];
                int n = i;
                a[0] = n %10;
                n /= 10;
                a[1] = n %10;
                n /= 10;
                a[2] =n %10;
                n /= 10;
                a[3] = n %10;
                n /= 10;
                a[4] = n %10;
                if (a[0] == a[4] && a[1] == a[3]) {
                     cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

}