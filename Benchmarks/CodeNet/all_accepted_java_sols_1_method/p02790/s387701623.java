import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            for (int i = 0; i < b; i++) {
                System.out.print(a);
            }
        } else if (b < a) {
            for (int i = 0; i < a; i++) {
                System.out.print(b);
            }
        } else {
            int min = Math.min(a, b);
            for (int i = 0; i < min; i++) {
                System.out.print(min);
            }
        }
        System.out.println("");
        sc.close();
    }
}
