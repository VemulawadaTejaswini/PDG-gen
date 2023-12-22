import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        String s = String.valueOf(a) + String.valueOf(b);

        int c = Integer.parseInt(s);

        boolean isSqare = false;

        for (int i = 1; i <= 1000; i++) {
            if (i * i == c) {
                System.out.println("Yes");
                isSqare = true;
                break;
            }
        }

        if (!isSqare)
            System.out.println("No");

    }
}