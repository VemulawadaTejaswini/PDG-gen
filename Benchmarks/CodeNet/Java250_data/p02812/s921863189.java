import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();

        int result = 0;
        for (int i = 2; i < n; i++) {
            result = s.charAt(i) == 'C' && s.charAt(i - 1) == 'B' && s.charAt(i - 2) == 'A' ? result + 1 : result;
        }

        System.out.println(result);

        sc.close();
    }
}
