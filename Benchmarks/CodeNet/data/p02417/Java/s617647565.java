import static java.lang.System.out;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strs = scan.nextLine().toLowerCase().split("");
        String[] alfabet = "abcdefghijklmnopqrstuvwxyz".split("");
        int[] ans = new int[27];
        int count = 0;
        while(strs.length > 1) {
            for (String a : alfabet) {
                for (String str : strs) {
                    if (str.equals(a)) {
                        ans[count]++;
                    }
                }
                count++;
            }
            strs = scan.nextLine().toLowerCase().split("");
            count = 0;
        }
        for (String a : alfabet) {                                     
            out.printf("%s : %d\n", a, ans[count]);
            count++;
        }
    }   
}