import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt(), n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        if (n == 100) n++;
        sb.append(n);
        for (int i = 0; i < d; i++) {
            sb.append("00");
        }
        System.out.println(sb.toString());
    }
}