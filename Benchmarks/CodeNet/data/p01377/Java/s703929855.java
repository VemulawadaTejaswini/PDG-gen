import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while (left <= right) {
            if (left == right) {
                if (arr[left] == '(' || arr[left] == ')') {
                    count++;
                }
                break;
            }
            if (arr[left] == '(') {
                if (arr[right] != ')') {
                    count++;
                }
            } else if (arr[left] == ')') {
                if (arr[right] != '(') {
                    count++;
                }
            } else {
                if (arr[left] != arr[right]) {
                    count++;
                }
            }
            left++;
            right--;
        }
        System.out.println(count);
    }
    
}
