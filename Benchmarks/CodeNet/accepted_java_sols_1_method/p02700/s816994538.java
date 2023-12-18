import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        while (A > 0 && C > 0) {
            C -= B;  //aoki
            if (C <= 0) {
                System.out.println("Yes");
                break;
            }
            A -= D;  //takahashi
            if (A <= 0) {
                System.out.println("No");
                break;
            }
        }
    }
}