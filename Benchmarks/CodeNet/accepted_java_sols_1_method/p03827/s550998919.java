
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        int x = 0;
        int max = 0;

        for (int i = 0; i<n; i++) {
            switch (s.charAt(i)) {
                case 'I':
                    x++;
                    break;
                case 'D':
                    x--;
                    break;
            }
            max = Math.max(max, x);
        }
        System.out.println(max);
    }

}
