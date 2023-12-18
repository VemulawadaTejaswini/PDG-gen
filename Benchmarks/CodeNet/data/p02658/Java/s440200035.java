import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long currentA = 1;
        double baseNum = Math.pow(10, 18);
        for (int i = 0; i < N; i++) {
            currentA *= sc.nextLong();
            if (baseNum <= (double) currentA) {
                currentA = -1;
                break;
            }
        }
        System.out.println(currentA);

    }
}
