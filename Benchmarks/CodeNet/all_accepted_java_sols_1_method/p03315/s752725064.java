import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int ans = 0;
        for(char c : s.toCharArray()) {
            if(c=='+') {
                ans++;
            } else if(c=='-') {
                ans--;
            }
        }
        System.out.println(ans);
    }
}