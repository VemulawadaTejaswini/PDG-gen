import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i=0; i<n; i++) {
            int ai = sc.nextInt();
            if ((i+1)%2 == 0) {
                continue;
            }
            if (ai%2 != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}