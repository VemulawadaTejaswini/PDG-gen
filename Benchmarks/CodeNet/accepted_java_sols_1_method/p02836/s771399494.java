import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int length = S.length();
        int cnt = 0;
        int left = 0;
        int right = length - 1;
        while (left < right) {
            if (S.charAt(left) != S.charAt(right)) {
                cnt++;
            }
            left++;
            right--;
        }
        System.out.println(cnt);
    }
}
