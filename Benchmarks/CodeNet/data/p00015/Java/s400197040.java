import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            StringBuffer int1 = new StringBuffer(scanner.next());
            StringBuffer int2 = new StringBuffer(scanner.next());

            StringBuffer result = new StringBuffer();
            int carry = 0;

            int1.reverse();
            int2.reverse();

            int maxDig = Math.max(int1.length(), int2.length());
            if (maxDig >= 80) {
                System.out.println("overflow");
                break;
            }

            for (int k = 0; k < maxDig; k++) {
                int aInt1 = 0;
                int aInt2 = 0;
                if (k < int1.length()) {
                    aInt1 = Integer.parseInt(int1.substring(k, k+1));
                }
                if (k < int2.length()) {
                    aInt2 = Integer.parseInt(int2.substring(k, k+1));
                }
                int aSum = carry + aInt1 + aInt2;
                if (aSum >= 10) {
                    carry = 1;
                    result.append(aSum-10);
                } else {
                    carry = 0;
                    result.append(aSum);
                }
            }
            if (carry == 1) {
                result.append(1);
            }
            
            if (result.length() >= 80) {
                System.out.println("overflow");
                break;
            }
            System.out.println(result.reverse());
        }
    }
}