import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long length = sc.nextInt();
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        long count = 0;
        for (int i = 1; i < length; i++) {
            if (arr[i - 1] == 'o' && arr[i] == 'o') {
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            length += count * 3;
            count *= 2;
        }
        System.out.println(length);
    }
}
