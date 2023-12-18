import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (c - (a - b) < 0) {
            System.out.print(0);
            return;
        }
        System.out.print(c - (a - b));
    }

}