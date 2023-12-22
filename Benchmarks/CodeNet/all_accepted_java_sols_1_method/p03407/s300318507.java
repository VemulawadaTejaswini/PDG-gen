import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        System.out.println(x + a >= b ? "Yes": "No");
    }
}
