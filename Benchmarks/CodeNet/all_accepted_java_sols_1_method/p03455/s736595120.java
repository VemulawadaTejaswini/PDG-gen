import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (((a & b) & 0x1) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
