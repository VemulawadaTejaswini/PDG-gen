import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        while (true) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (x==0 && y==0) break;

            if (x > y) {
                System.out.println(y + " " + x);
            } else {
                System.out.println(x + " " + y);
            }
        }
    }
}
