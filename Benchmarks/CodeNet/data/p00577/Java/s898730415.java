import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        int idx = 0;
        int count = 0;
        while (idx < n - 1) {
            if (arr[idx] == 'O' && arr[idx + 1] == 'X') {
                count++;
                idx += 2;
            } else if (arr[idx] == 'X' && arr[idx + 1] == 'O') {
                count++;
                idx += 2;
            } else {
                idx++;
            }
        }
        System.out.println(count);
     }
}
