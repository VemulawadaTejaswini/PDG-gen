import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        sc.close();

        int judge = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i != a) {
                if (0 <= Character.getNumericValue(s.charAt(i)) && 9 >= Character.getNumericValue(s.charAt(i))) {
                    continue;
                } else {
                    judge = 0;
                    break;
                }
            } else {
                if (s.charAt(i) == '-') {
                    continue;
                } else {
                    judge = 0;
                    break;
                }
            }
        }

        if (judge == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
