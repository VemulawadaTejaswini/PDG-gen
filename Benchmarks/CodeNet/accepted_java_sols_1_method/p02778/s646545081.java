import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String x = "";
        for (int i = 0; i < s.length(); i++) {
            x += 'x';
        }
        System.out.println(x);
        sc.close();
    }
}