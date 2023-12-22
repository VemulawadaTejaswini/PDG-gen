import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        String s = "abcdefghijklmnopqrstuvwxyz";
        String ans = "";
        n = n - 1;
        int a;
        char c;


        while (n / 26!=0) {
            long num = n % 26;
            a = (int) num;
            c = s.charAt(a);
            ans = String.valueOf(c) + ans;

            n = (n / 26)-1;

        }
        long num = n % 26;
        a = (int) num;
        c = s.charAt(a);
        ans = String.valueOf(c) + ans;



        System.out.println(ans);

        scn.close();

    }


}
