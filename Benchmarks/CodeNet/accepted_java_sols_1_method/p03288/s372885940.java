import java.util.Arrays;
import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int r = sc.nextInt();
        if (r < 1200){
            System.out.println("ABC");
        } else if (r < 2800) {
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
    }
}