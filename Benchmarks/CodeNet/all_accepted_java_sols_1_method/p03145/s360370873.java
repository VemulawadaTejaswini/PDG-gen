import java.util.Scanner;

class Main{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println((int)a * b / 2);
        scanner.close();
    }
}