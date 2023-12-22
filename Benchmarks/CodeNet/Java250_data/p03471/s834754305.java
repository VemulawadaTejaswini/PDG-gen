import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int Y = scan.nextInt();

        for (int x = 0; x < n + 1; x++) {
            for (int y = 0; x + y < n + 1; y++) {
                int z = n - x - y;
                if (10000 * x + 5000 * y + 1000 * z == Y) {
                    System.out.println(x + " " + y + " " + z);
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}