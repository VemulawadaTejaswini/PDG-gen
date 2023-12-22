import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] g = {0, 0, 2, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0};

        if (g[a] == g[b]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}