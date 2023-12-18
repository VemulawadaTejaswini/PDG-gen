import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        if (X <= 500*K) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}