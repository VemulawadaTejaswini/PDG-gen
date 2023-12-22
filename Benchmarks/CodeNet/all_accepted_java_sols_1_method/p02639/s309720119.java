import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        for(int i = 1; i < 6; i++) {
            int a = sc.nextInt();
            if (a == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}