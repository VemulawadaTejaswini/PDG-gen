import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String[] weightBinary = new StringBuffer(Integer.toBinaryString(Integer.parseInt(sc.next()))).reverse().toString().split("");

            for (int i = 0; i < weightBinary.length; i++) {
                if ("1".equals(weightBinary[i])) {
                    if (i == weightBinary.length - 1) {
                        System.out.println((int) Math.pow(2, i));
                    } else {
                        System.out.printf("%d ", (int) Math.pow(2, i));
                    }
                }
            }
        }
    }
}