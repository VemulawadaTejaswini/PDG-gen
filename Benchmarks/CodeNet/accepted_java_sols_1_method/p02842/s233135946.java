import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double taxRate = 1.08d;
        int a = (int) (n / taxRate);
        
        String result = ((int) (a * taxRate) == n)
            ? String.valueOf(a)
            : (int)((a + 1) * taxRate) == n
                ? String.valueOf(a+1)
                : ":(";
        System.out.println(result);
    }
}