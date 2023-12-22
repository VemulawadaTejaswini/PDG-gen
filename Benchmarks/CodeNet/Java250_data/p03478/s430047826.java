import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int total = 0;
        for(int i = 1; i <= N; i++) {
            int sum = findSumOfDigists(i);
            if(sum >= A && sum <= B) {
                total += i;
            }
        }
        System.out.println(total);
    }

    public static int findSumOfDigists(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
