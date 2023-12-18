import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = new char[n];
        c = sc.next().toCharArray();
        int left = 0, right = n - 1;
        int res = 0;
        while(left < right) {
            if (c[left] == 'R') {
                left++;
                continue;
            }
            while(right > left && c[right] == 'W')
                right--;
            if(right > left)
                res++;
            left++;
            right--;
        }
        System.out.println(res);
    }
}