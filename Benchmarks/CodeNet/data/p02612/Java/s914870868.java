import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int readyMoney = 1000 * (N / 1000 + 1);
        int change = readyMoney - N;
        System.out.println(change);
    }
}