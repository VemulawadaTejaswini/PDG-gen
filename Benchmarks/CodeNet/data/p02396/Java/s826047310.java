import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < 10000 && n != 0; i++) {
            System.out.println("Case " + (i+1) + ": " + n);
            n = sc.nextInt();
        }
    }
}
