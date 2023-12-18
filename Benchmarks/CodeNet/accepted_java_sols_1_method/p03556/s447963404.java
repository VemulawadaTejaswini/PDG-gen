import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        for (int i = n; i >= 0; i--) {
            int a = (int)Math.sqrt(i);
            if (a * a == i) {
                System.out.println(i);
                return;
            }
        }
    }
}