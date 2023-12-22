import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int n = s.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(s[i] != '0'){
                cnt++;
            }
        }

        System.out.println(Math.min(cnt, n-cnt) *2);
        sc.close();
    }

}
