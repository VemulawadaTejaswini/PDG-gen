
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mine = scan.nextInt();
        int friend = scan.nextInt();
        int book = scan.nextInt();

        if (mine >= book) {
            System.out.println(0);
        } else if (friend + mine < book) {
            System.out.println("NA");
        } else {
            System.out.println(book - mine);
        }

    }
}

