import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nc = n;
        int sn = 0;
        while (true) {
            sn += nc % 10;
            nc /= 10;
            if (nc == 0)
                break;
        }
        if (n % sn == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}