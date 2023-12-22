import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            String nl = sc.nextLine();

            if ("0".equals(nl)) {
                break;
            }

            int ans = 0;

            for (int i = 0; i < nl.length(); i++) {
                ans += Character.getNumericValue(nl.charAt(i));
            }

            System.out.println(ans);
        }
    }
}