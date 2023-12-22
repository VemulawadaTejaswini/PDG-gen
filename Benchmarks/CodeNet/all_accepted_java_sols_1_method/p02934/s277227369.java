import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inv = 0;
        for (int i = 0, lim = sc.nextInt(); i < lim; i++) {
            inv += (1.0 / sc.nextInt());
        }
        System.out.println(1.0 / inv);
    }
}