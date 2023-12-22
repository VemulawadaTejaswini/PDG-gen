import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String W = sc.next();
        String T;
        int cnt = 0;
        while (!((T = sc.next()).equals("END_OF_TEXT"))) {
            if (T.equalsIgnoreCase(W)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}