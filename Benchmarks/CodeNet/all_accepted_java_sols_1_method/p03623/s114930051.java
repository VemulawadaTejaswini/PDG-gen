import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        if (Math.abs(x - a) > Math.abs(x - b)) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}