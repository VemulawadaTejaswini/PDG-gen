import static java.lang.System.out;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strs = scan.nextLine().toLowerCase().split("");
        String[] alfabet = "abcdefghijklmnopqrstuvwxyz".split("");
        int ans = 0;
        for (String a : alfabet) {
            for (String str : strs) {
                if (str.equals(a)) {
                    ans++;
                }
            }
            out.printf("%s:%d\n", a, ans);
            ans = 0;
        }
    }   
} 