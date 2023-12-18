import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String symbol = null;
        if (a > b)
            symbol = ">";
        if (a == b)
            symbol = "==";
        if (a < b)
            symbol = "<";
        System.out.printf("%s %s %s", "a", symbol, "b\n");
        sc.close();
    }
}

