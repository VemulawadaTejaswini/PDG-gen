import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt();
        int tmp = a;
        int i;
        for (i = a; i < a + k && i <= b; i++) {
            System.out.println(i);
            tmp = i;
        }
        tmp++;
        for (i = Math.max(b - k + 1, tmp); i <= b; i++) {
            System.out.println(i);
        }
    }
}