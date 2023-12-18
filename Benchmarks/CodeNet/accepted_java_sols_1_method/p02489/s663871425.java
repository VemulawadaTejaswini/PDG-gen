import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1;; i++) {
            int next = sc.nextInt();
            if (next == 0) {
                break;
            }
            System.out.println(String.format("Case %d: %d", i, next));
        }
    }
}