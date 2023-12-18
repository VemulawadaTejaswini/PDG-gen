
import java.util.Scanner;

public class Main {

    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static int countOnes(char[] binary) {
        int count = 0;
        for (char d : binary) {
            if (d == '1') {
                count++;
            }
        }
        return count;
    }

    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        String x = sc.next();
        char[] xarr = x.toCharArray();
        for (int i = 0; i < xarr.length; i++) {
            int count = 0;
            if (xarr[i] == '1') {
                xarr[i] = '0';
            } else {
                xarr[i] = '1';
            }
            int val = binaryToDecimal(String.valueOf(xarr));
            char[] binaryString = xarr.clone();
            while (val != 0) {
                val = val % countOnes(binaryString);
                binaryString = decimalToBinary(val).toCharArray();
                count++;
            }
            if (xarr[i] == '1') {
                xarr[i] = '0';
            } else {
                xarr[i] = '1';
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb.toString());
    }
}
