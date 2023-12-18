import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String x = sc.next();
            if (x.equals("0")) return;
            int sum = 0;
            for (int i = 0; i < x.length(); i++) {
                sum += Character.getNumericValue(x.charAt(i));
            }
            System.out.println(sum);
        }
    }
}

