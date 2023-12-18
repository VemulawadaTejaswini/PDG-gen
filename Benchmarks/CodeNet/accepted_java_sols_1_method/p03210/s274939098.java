import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        String result = "NO";
        if (x == 7 || x == 5 || x == 3) result = "YES";
        System.out.println(result);
    }
}
