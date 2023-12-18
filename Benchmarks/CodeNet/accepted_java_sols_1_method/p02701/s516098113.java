import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        Set<String> prizes = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String prize = sc.next();
            prizes.add(prize);
        }

        int result = prizes.size();

        System.out.println(result);
    }
}