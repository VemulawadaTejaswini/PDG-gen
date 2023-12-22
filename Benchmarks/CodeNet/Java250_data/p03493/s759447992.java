import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String abc = sc.next();
        char ONE = '1';
        int cnt = 0;
        for (char s : abc.toCharArray()) {
            if(ONE == s) {
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}