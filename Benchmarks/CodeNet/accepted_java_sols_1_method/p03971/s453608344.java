import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int ko = 0;
        int ka = 0;
        for (int i = 0 ; i < n ; i++) {
            if (s[i] == 'a') {
                if (ko < a + b) {
                    System.out.println("Yes");
                    ko++;
                } else {
                    System.out.println("No");
                }
            }
            if (s[i] == 'b') {
                if (ko < a + b && ka < b) {
                    System.out.println("Yes");
                    ko++;
                    ka++;
                } else {
                    System.out.println("No");
                }
            }
            if (s[i] == 'c') {
                System.out.println("No");
            }
        }
    }

}