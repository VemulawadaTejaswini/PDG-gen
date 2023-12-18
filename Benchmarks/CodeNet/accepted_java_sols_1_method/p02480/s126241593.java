import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        int cube = (int)Math.pow(x, 3);
        System.out.println(cube);
    }
}