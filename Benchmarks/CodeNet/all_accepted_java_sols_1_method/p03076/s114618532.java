import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int min = 10;
        for (int i = 0; i < 5; i++) {
            float a = sc.nextFloat();
            n += Math.ceil(a / 10) * 10;
            String str = String.valueOf((int)a);
            int b = Integer.parseInt(str.substring(str.length() - 1));
            if (b < min && b >= 1) {
                min = b;
            }
        }
        System.out.println(n + min - 10);
    }
}