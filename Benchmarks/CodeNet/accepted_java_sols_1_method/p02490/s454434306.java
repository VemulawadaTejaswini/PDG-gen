import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == 0 && y == 0) {
                break;
            }
            System.out.println(String.format("%d %d", Math.min(x, y), Math.max(x, y)));
        }
    }
}