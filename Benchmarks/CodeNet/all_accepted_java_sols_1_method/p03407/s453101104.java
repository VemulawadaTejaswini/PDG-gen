import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt();
        int y = cin.nextInt();
        int z = cin.nextInt();

        System.out.println((x + y >= z) ? "Yes" : "No");
    }
}