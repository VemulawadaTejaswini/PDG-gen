import java.util.Scanner;

class Main{

    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        int n = scan.nextInt();

        int h = n / 3600;
        int s = n % 60;
        int m = (n - h*3600) / 60;

        System.out.printf("%d:%d:%d\n", h, m, s);
    }
}


