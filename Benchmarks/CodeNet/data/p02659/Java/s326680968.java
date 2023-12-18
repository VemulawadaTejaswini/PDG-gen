import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long A = Long.parseLong(s.next());
        double B = s.nextDouble();
        System.out.print((long) Math.floor(A * B));
    }
}