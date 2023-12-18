import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            if(sc.nextInt() == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
