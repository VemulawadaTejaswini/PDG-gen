import java.util.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int n = scan.nextInt();
            if (n == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}