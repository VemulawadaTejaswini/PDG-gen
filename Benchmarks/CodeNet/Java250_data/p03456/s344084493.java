import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int sum = a * (int)Math.pow(10, String.valueOf(b).length()) + b;
        int sqrt = (int)Math.sqrt(sum);
        System.out.println(sqrt * sqrt == sum ? "Yes" : "No");
    }
}