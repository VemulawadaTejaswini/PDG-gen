import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int pass = 0;
        int abroad = 0;
        for (int i = 0 ; i < n ; i++) {
            if (s[i] == 'a' && pass < a + b) {
                System.out.println("Yes");
                pass++;
            } else if (s[i] == 'b' && pass < a + b && abroad < b) {
                System.out.println("Yes");
                pass++;
                abroad++;
            } else {
                System.out.println("No");
            }
        }
    }

}
