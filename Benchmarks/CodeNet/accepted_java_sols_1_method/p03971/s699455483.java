import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        String s = in.next();

        int total = 0;
        int oversea = 0;
        for (int i = 0; i < n; i++) {
            switch (s.charAt(i)) {
                case 'a':
                    if (total < a + b) {
                        total++;
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                    break;
                case 'b':
                    if (total < a + b && oversea < b) {
                        total++;
                        oversea++;
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                    break;
                case 'c':
                    System.out.println("No");
                    break;
            }
        }
    }
}