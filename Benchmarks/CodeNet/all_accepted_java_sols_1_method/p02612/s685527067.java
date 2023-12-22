import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int x = n % 1000;

        if (x==0) {
            System.out.println(0);
        } else {
            System.out.println(1000 - x);
        }
    }


}