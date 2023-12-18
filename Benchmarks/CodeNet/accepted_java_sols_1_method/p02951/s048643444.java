import java.util.Scanner;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();

        if(c-(a-b) <= 0) {
            System.out.println(0);
        }else {
        System.out.println(c-(a-b));
        }
    }

}