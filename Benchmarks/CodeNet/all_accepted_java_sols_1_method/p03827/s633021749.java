import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int max = 0;
        int currentPoint = 0;
        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == 'D') {
                currentPoint--;
            } else {
                currentPoint++;
            }

            max = Math.max(max, currentPoint);
        }

        System.out.println(max);
    }
}
