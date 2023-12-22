import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int temp = N;
        int s = 0;
        while (temp >= 1) {
            s += temp % 10;
            temp /= 10;
        }
        if (N % s == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
