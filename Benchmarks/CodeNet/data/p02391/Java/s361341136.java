import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        compare(a, b);
    }

    private static void compare(int a, int b) {
        if (a < b) {
            System.out.println("a < b");
        } else if (a > b){
            System.out.println("a > b");
        } else {
            System.out.println("a == b");
        }
    }
}
