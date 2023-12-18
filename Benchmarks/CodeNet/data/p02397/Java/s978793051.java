import java.util.Scanner;

public class Main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        while (true) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x == 0 && y == 0) {
                break;
            }
            comp(x,y);
        }
    }

    private static void comp(int x,int y) {
        if (x < y) {
            System.out.println(x +" "+y);
        } else {
            System.out.println(y +" "+x);
        }
    }
}