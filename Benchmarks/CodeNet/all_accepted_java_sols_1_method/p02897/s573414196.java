import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        if(n % 2 == 0) {
            a = n / 2;
        } else {
            a = n / 2 +1;
        }
        double ans =  (double)a / (double)n;
        System.out.println(ans);
    }
}