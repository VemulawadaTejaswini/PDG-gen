import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        char[] s = sc.next().toCharArray();
        boolean result = true;
        for (int i = 0; i < s.length; i++) {
            if (i < a) {
                if (s[i] < '0' || s[i] > '9') {
                    result = false;
                }
            } else if (i == a){
                if (s[i] != '-') {
                    result = false;
                }
            } else {
                if (s[i] < '0' || s[i] > '9') {
                    result = false;
                }
            }
        }
        String ans;
        if (result) {
            ans = "Yes";
        } else {
            ans = "No";
        }


        System.out.println(ans);
    }

}
