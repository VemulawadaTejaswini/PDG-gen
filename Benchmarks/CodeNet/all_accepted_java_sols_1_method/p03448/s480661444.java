import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        int x = Integer.parseInt(scan.nextLine());

        int count = 0;
        for (int i = 0; i < a + 1; i++) {
            for (int j = 0; j < b + 1; j++) {
                for (int k = 0; k < c + 1; k++) {
                    if (500 * i + 100 * j + 50 * k == x) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}