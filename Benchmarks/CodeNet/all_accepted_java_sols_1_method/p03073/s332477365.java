import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int ans1 = 0;
        int ans2 = 0;
        for (int i = 0; i < s.length; i++) {
            if(i % 2 == 0 && s[i] == '0') {
                ans1++;
            } else if(i % 2 == 0 && s[i] == '1'){
                ans2++;
            } else if(i % 2 != 0 && s[i] == '0') {
                ans2++;
            } else if(i % 2 != 0 && s[i] == '1') {
                ans1++;
            }
        }
        System.out.println(Math.min(ans1, ans2));
    }
}