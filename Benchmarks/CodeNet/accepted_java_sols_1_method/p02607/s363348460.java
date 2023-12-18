import java.util.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i = 1; i < N+1; i++) {
            int a = sc.nextInt();
            if (i%2 != 0 && a%2 != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}