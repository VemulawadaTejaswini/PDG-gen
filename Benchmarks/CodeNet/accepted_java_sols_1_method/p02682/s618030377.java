import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int maxSum = 0;

        if (k<=a) {
            maxSum = k;
        }else if (k <= a+b) {
            maxSum = a;
        }else if (k <= a+b+c) {
            maxSum = a - (k-a-b);
        }


        // 出力
        System.out.println(maxSum);
    }
}