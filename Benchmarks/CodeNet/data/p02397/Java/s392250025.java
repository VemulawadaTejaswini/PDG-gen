import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        while (true) {
            x = Integer.parseInt(sc.next());
            y = Integer.parseInt(sc.next());
            if (x == 0 && y == 0)
                break;
            else if (x > y)
                System.out.println(y + " " + x); 
            else
                System.out.println(x + " " + y);
        }
    }
}
