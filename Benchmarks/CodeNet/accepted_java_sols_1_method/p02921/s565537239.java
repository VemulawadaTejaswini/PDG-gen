import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s;
        String t;

        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        t = sc.nextLine();

        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
