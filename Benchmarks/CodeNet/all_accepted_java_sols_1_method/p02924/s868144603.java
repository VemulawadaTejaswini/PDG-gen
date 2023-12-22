import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Integer.parseInt(sc.next());
        System.out.println(N * (N-1) / 2);
    }
}