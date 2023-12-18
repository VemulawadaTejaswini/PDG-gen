import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = new char[n];
        for(int i = 0; i < n; i++) {
            c[i] = sc.next().charAt(0);
        }
        int left = 0, right = n - 1;
        int res = 0;
        while(left < right) {
            if (c[left] == 'R') {
                left++;
                continue;
            }
            while(right > left && c[right] == 'W')
                right--;
            res++;
            left++;
            right--;
        }
        System.out.println(res);
    }
}