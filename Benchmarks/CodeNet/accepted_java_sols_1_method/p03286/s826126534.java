import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder sb = new StringBuilder();
        while(n != 0) {
            sb.append(n % 2 == 0 ? 0 : 1);
            n -= Math.abs(n%2);
            n /= -2;
        }
        if(sb.length() == 0) sb.append(0);
        System.out.println(sb.reverse().toString());
    }
}
