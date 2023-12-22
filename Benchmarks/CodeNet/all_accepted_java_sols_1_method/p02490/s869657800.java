import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = 1;
        int x;
        int y;
        ArrayList<String> a = new ArrayList<String>();
        while (true) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x == 0 && y == 0) {
                break;
            }
            if (x > y) {
                a.add(y + " " + x);
            } else {
                a.add(x + " " + y);
            }
            time += 1;
        }
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) != null) {
                System.out.println(a.get(i));
            }
        }
    }
}