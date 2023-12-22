import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int sum = 0;
        for(int i=1; i<=n; i++) {
            int num = i;
            int tmp = 0;
            while(true) {
                if(num > 0) {
                    tmp += num % 10;
                    num /= 10;
                } else {
                    break;
                }
            }
            if(tmp >= a && tmp <= b) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
