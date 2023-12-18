import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static Main    main;

    public static void main(String[] args) {

        main = new Main();
        main.run();
    }

    private void run() {

        int dataSet = sc.nextInt();
        int i = 0;
        while (i < dataSet) {
            int input = sc.nextInt();
            System.out.println("Case " + (i + 1) + ":");
            for (int n = 0; n < 10; n++) {
                String out = String.valueOf(square(input));
                out = pick(out);
                System.out.println(out);
                input = Integer.parseInt(out);
            }
            i++;
        }
    }

    private int square(int i) {

        return i * i;
    }

    private String pick(String str) {

        if (str.length() < 6) {
            return str.substring(0, str.length() - 2);
        } else {
            return str.substring(str.length() - 6, str.length() - 2);
        }
    }
}