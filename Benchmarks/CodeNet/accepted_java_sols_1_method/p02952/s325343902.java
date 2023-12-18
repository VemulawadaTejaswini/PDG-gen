import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String N = in.next();
        int res = 0;

        for (int i = 1; i <= Integer.parseInt(N); i++)
            if (String.valueOf(i).length() % 2 == 1) res++;
        System.out.println(res);
    }
}
