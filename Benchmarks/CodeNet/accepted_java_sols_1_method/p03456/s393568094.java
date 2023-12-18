import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int c = Integer.parseInt(a + b);
        for (int i = 1; ; i++) {
            int tmp = i * i;
            if(tmp == c) {
                System.out.println("Yes");
                return;
            } else if(tmp > c) {
                System.out.println("No");
                return;
            }
        }
    }
}