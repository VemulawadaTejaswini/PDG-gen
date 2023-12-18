import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = N / 1000;
        if (0 < N % 1000) {
            num++;
        }
        System.out.println(num * 1000 - N);
    }
}