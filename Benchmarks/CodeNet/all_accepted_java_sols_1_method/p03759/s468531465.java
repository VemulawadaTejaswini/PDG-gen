import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a, b, c;

        a = cin.nextInt();
        b = cin.nextInt();
        c = cin.nextInt();

        if (b - a == c - b) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}