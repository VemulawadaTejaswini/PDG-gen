import java.util.*;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        char prev = 'o';
        for (int i = 1; i < n; i++) {
            if (arr[i] == 'x' && arr[i - 1] == 'x') {
                System.out.println(i);
                return;
            }
        }
        System.out.println(n);
    }
}
