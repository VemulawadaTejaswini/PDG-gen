import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        String s;
        for (int i = 0; i < h; i++) {
            s = sc.next();
            for (int j = 0; j < 2; j++) {
                System.out.println(s);
            }
        }
    }
}