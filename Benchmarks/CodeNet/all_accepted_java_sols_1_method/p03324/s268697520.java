import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();

        if (D == 0) {
            if (N == 100) {
                System.out.println(101);
            } else {
                System.out.println(N);
            }
        } else if (D == 1) {
            if (N == 100) {
                System.out.println(10100);
            } else {
                System.out.println(N * 100);
            }
        } else {
            if (N == 100) {  
                System.out.println(1010000);
            } else {
                System.out.println(N * 10000);
            }
        }
    }
}
