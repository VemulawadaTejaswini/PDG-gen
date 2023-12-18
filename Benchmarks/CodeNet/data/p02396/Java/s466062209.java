import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int x = sc.nextInt(), i = 0; x != 0; x = sc.nextInt(), i++) {
            i++;
            System.out.println("Case " + i + ": " + x);
        }
    }
}