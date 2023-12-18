import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt(), h = sc.nextInt();
        String c = sc.next();

        System.out.print("+");
        for(int i = 1; i < w - 1; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        for(int i = 0; i < h - 2; i++) {
            System.out.print("|");
            for(int j = 0; j < w - 2; j++) {
                System.out.print((i == h / 2 - 1 && j == w / 2 - 1) ? c : ".");
            }
            System.out.println("|");
        }

        System.out.print("+");
        for(int i = 1; i < w - 1; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}