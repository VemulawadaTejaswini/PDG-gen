import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.next();
            if (s.equals("-")) {
                break;
            }
            int time = sc.nextInt();
            for (int i = 0; i < time; i++) {
                int shuffle = sc.nextInt();
                s = s.substring(shuffle) + s.substring(0, shuffle);
            }
            System.out.println(s);
        }
    }
}