import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.next();
        int m, h;

        String first, second;

        while (!line.equals("-")) {
            m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                h = sc.nextInt();
                first = line.substring(0,h);
                second = line.substring(h,line.length());

                line = second + first;
            }

            System.out.println(line);

            line = sc.next();

        }

        sc.close();
    }
}
