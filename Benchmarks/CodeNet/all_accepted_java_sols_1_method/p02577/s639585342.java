import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.next().split("");

        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += Integer.parseInt(n[i]);
        }

        if (sum%9 == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
