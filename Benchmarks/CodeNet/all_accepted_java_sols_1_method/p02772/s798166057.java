import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for(int i = 0; i < n; i++) {
            int a = scan.nextInt();
            if(a % 2 == 0 && !(a % 3 == 0 || a % 5 == 0)) {
                System.out.println("DENIED");
                scan.close();
                return;
            }
        }
        System.out.println("APPROVED");

        scan.close();
        return;
    }
}