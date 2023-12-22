import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        int c = Integer.parseInt(scan.next());
        if(a==b) {
            if(a==c) {
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }
        } else if(a==c) {
            System.out.println("Yes");
        } else if(b==c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
