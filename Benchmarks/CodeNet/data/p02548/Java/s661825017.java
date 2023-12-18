import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);

        long count = 0;
        for (int c = 1; c < n; c++) {
            int ab = (n - c);
            int rootab = (int)Math.sqrt(ab) + 1;
            for (int i = 1; i < rootab; i++) {
                if ((ab / i) * i == ab) {
                    if (ab / i != i) {
                        count += 2;
                    } else {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }

}