import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        if (A >= B && A >= C) {
            System.out.println((int)(A * Math.pow(2, K) + B + C));
        }
        else if (B >= A && B >= C) {
            System.out.println((int)(B * Math.pow(2, K) + A + C));
        }
        else {
            System.out.println((int)(C * Math.pow(2, K) + A + B));
        }
    }
}