import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String[] days = new String[]{"thu", "fri", "sat","sun","mon", "tue", "wed"};
        System.out.println(days[x % 7]);
    }
}

