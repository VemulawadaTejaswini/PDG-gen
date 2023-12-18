import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), result = 1;

        for(int i = 0; i < n; i++) {
            if(2 * result > k + result) {
                result += k;
            } else {
                result *= 2;
            }
        }

        System.out.println(result);
    }
}
