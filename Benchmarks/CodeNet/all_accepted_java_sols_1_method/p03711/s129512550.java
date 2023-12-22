import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        List a = Arrays.asList(new Integer[]{1, 3, 5, 7, 8, 10, 12});
        List b = Arrays.asList(new Integer[]{4, 6, 9, 11});
        
        if (a.indexOf(x) != -1 && a.indexOf(y) != -1 ||
            b.indexOf(x) != -1 && b.indexOf(y) != -1 ||
            x == y) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        
    }
}