import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int length = arr.length;
        int left = 0;
        int right = length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                System.out.println("No");
                return;
            }
            left++;
            right--;
        }
        left = 0;
        right = length / 2 - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                System.out.println("No");
                return;
            }
            left++;
            right--;
        }
        left = (length + 3) / 2 - 1;
        right = length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                System.out.println("No");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Yes");
    }
}