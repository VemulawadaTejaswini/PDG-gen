import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = A+B;
        if (K%2 == 0) {
            System.out.println(K/2);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}