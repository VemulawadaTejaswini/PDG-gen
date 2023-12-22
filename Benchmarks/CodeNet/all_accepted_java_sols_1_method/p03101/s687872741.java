import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hh = sc.nextInt();
        int ww = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();
        System.out.println((hh - h) * (ww - w));
    }

}
