import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split("/");
        int y = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        int d = Integer.parseInt(a[2]);
        
        if (y <= 2019 && m <= 4 && d <= 30) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}
