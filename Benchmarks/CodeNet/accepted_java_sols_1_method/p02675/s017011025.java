import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n % 10;
        if(x == 3) System.out.println("bon");
        else if(x == 0 || x == 1 || x == 6 || x == 8) System.out.println("pon");
        else System.out.println("hon");
    }
}