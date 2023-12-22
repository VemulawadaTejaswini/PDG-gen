import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int w = scan.nextInt();
        if (w >= s) {
            System.out.print("unsafe");
        } else {
            System.out.print("safe");
        }
    }
}