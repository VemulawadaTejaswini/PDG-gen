import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        while (true) {
            x = sc.next();
            if(x.equals("0")) break;
            int sum = 0;
            for (int i = 0; i < x.length(); i++) {
                sum += x.charAt(i) - '0';
            }
            System.out.println(sum);
        }
    }
}