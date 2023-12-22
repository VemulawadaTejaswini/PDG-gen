import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int ans = 0;
        int tmp = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A' || s.charAt(i) == 'T' || s.charAt(i) == 'G' || s.charAt(i) == 'C') {
                tmp++;
            }else {
                ans = Math.max(ans, tmp);
                tmp = 0;
            }
        }
        ans = Math.max(ans, tmp);

        System.out.println(ans);

        sc.close();
    }
}