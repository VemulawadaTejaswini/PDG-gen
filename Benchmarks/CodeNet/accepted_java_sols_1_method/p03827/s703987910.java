import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        sc.close();

        int x = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                x++;
                max = Math.max(max, x);
            } else {
                x--;
                max = Math.max(max, x);
            }
        }

        System.out.println(max);

    }
}