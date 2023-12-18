
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String[] a_b = sc.nextLine().split(" ");
            int a = Integer.parseInt(a_b[0]);
            int b = Integer.parseInt(a_b[1]);
            if (a == 0 && b == 0) {
                break;
            }
            if (a > b) {
                System.out.println(b + " " + a);
            } else {
                System.out.println(a + " " + b);
            }
        }
    }
}


