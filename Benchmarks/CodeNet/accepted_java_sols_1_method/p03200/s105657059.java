import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int idx = 0;
        long count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'W') {
                count += i - idx;
                idx++;
            }
        }
        System.out.println(count);
    }
}
