import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if(n % 10 == 7 ||
           n % 100 - n % 10 == 70 ||
           n % 1000 - n % 100 == 700) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scan.close();
        return;
    }
}