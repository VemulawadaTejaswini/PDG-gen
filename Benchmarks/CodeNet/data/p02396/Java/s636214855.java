import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int x = sc.nextInt(), i = 1; x != 0; x = sc.nextInt(), i++) {
            System.out.println("Case " + i + ": " + x);
        }
    }
}