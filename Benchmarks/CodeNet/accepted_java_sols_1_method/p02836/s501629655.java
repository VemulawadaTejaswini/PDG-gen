import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int left;
        int right;
        if (arr.length % 2 == 0) {
            left = arr.length / 2 - 1;
            right = arr.length / 2;
        } else {
            left = arr.length / 2;
            right = arr.length / 2;
        }
        int count = 0;
        while (left >= 0) {
            if (arr[left] != arr[right]) {
                count++;
            }
            left--;
            right++;
        }
        System.out.println(count);
    }
}
