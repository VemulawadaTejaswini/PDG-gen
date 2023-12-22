import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        int result = 0;
        for (int i = 111; i <= 999 && result == 0; i += 111) {
            if (n <= i) {
                result = i;
            }
        }

        System.out.println(result);
    }
}