import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int K, A, B;
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        int temp = B/K;
        if(temp*K >= A)
        System.out.println("OK");
        else System.out.println("NG");
    }
}
