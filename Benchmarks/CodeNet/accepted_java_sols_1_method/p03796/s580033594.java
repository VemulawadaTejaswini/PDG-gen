import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        double result = 1;
        double pow = Math.pow(10, 9) + 7;
        for (int i = 1; i <= n; i++) {
            result = (result * i) % pow;
        }

        System.out.println((long) (result % pow));
    }
}