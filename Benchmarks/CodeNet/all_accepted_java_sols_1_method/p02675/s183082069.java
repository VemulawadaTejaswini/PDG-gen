import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int nn = n % 10;

        if(nn == 2 || nn == 4 || nn == 5 || nn == 7 || nn == 9) {
            System.out.println("hon");
        } else if(nn == 0 || nn == 1 || nn == 6 || nn == 8) {
            System.out.println("pon");
        } else {
            System.out.println("bon");
        }
    }
}
