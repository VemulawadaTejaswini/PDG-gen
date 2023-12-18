import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        
        for(int i = 0;i < (s.length / 2);i++) {
            char tmp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = tmp;
        }
        
        int[] result = new int[2019];
        long ans = 0;
        result[0] = 1;
        int num = 0;
        int ten = 1;
        for(int i = 0;i < s.length;i++) {
            num = (num + ten * (s[i] - '0')) % 2019;
            ans += result[num];
            result[num] += 1;
            ten = ten * 10 % 2019;
        }

        System.out.println(ans);
    }
}