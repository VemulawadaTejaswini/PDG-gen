import java.util.Scanner;

public class Main {
    private final static String ZERO = "Zero";
    private final static String POSITIVE = "Positive";
    private final static String NEGATIVE = "Negative";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a <= 0 && b >= 0) {
            System.out.println(ZERO);
        } else if (a > 0 && b > 0) {
            System.out.println(POSITIVE);
        } else {
            int count = b - a + 1;
            
            if (count % 2 == 0) {
                System.out.println(POSITIVE);
            } else {
                System.out.println(NEGATIVE);
            }
        }
    }
}