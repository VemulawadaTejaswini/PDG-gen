import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == 0 && y == 0)
                break;
            if (x > y)
                System.out.println(y + " " + x);
            else
                System.out.println(x + " " + y);
        }
    }
}

