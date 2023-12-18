
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = Integer.parseInt(scan.next());
        scan.close();

        System.out.println(2*r*3.1415926535);
    }

}