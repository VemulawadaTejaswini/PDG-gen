import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans0 = 0, ans1 = 0;
        for (int i=0; i<s.length(); ++i) {
            if ((i&1)==0) {
                if (s.charAt(i)=='0') {
                    ans1++;
                } else {
                    ans0++;
                }
            } else {
                if (s.charAt(i)=='0') {
                    ans0++;
                } else {
                    ans1++;
                }
            }
        }
        System.out.println(Math.min(ans0, ans1));
    }
}
