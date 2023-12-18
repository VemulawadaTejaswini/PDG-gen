import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int A = Integer.parseInt(scan.next()); 
        int B = Integer.parseInt(scan.next()); 
        scan.close();
        int sum = A + B;
        int minus = A - B;
        int multi = A * B;

        if (sum > minus) {
            if (sum > multi) {
                System.out.println(sum);
            } else {
                System.out.println(multi);
            }
        } else {
            if (minus > multi) {
                System.out.println(minus);
            } else {
                System.out.println(multi);
            }
        }
    }
}