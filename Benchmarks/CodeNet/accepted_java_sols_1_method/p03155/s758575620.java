import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        scanner.close();

        int ansOfHeight = n - h + 1;
        int ansOfWidth = n - w + 1;

        System.out.println(ansOfHeight * ansOfWidth);
    }

}
