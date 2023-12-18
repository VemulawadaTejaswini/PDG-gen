import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int result = 0;
        int lower;
        int upper;

        lower = Math.max(a, c);
        upper = Math.min(b, d);

        if (upper >= lower) {
            result = upper - lower;
        }

        System.out.println(result);
    }
}