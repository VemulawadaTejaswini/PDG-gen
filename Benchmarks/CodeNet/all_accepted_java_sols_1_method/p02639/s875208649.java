import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 1;
        for (result=1; result<=5; result++) {
            int xi = sc.nextInt();
            if (xi == 0) {
                break;
            }
        }
        System.out.println(result);
    }
}