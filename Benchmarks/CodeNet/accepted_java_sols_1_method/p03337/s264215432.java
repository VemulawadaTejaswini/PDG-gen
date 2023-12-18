import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt();
        int max = Math.max(Math.max(a + b, a - b), a * b);
        System.out.println(max);
    }
}
