import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        int tmp = n;
        while(true) {
            sum += tmp % 10;
            if(tmp / 10 > 0) {
                tmp /= 10;
            } else {
                 break;
            }
        }

        if(n % sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
