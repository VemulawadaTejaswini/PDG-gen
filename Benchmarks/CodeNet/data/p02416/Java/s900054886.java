import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            char[] digits = scanner.next().toCharArray();
            
            if(digits.length == 1 && digits[0] == '0')
                return;

            int ans = 0;
            for(int i = 0; i < digits.length; ++i) {
                ans += Character.getNumericValue(digits[i]);;
            }

            System.out.println(ans);
        }
    }
}
