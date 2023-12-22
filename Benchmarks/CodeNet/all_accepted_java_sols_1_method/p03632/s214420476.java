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
        int lowwer = 0;
        int upper = 0;

        if (a >= c) {
            lowwer = a;
        } else {
            lowwer = c;
        }

        if (b <= d) {
            upper = b;
        } else {
            upper = d;
        }

        if (upper >= lowwer) {
            result = upper - lowwer;
        }

        System.out.println(result);
    }
}