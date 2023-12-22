import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int n = in.nextInt();
        for (; n > 0; n--) h -= in.nextInt();
        if (h <= 0)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
