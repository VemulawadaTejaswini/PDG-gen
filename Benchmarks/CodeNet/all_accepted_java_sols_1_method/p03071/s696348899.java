import java.util.Scanner;

/**
 * @author subaru
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int answer = 0;
        answer += A > B ? A-- : B--;
        answer += A > B ? A : B;
        System.out.println(answer);
    }
}
