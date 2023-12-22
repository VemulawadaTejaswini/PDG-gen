import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    static final int modnum = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> list = new ArrayList<String>();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextLine());
        }
        int ans = 0;

        int a = 0;
        int b = 0;
        int ab = 0;

        for (String str : list) {
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == 'A' && str.charAt(i + 1) == 'B')
                    ans++;
            }
            // if(str.contains("AB")){
            // ans++;
            // }

            if (str.charAt(0) == 'B' && str.charAt(str.length() - 1) == 'A') {
                ab++;
            } else {
                if (str.charAt(str.length() - 1) == 'A') {
                    a++;
                }
                if (str.charAt(0) == 'B') {
                    b++;
                }
            }
        }
        // System.out.println(ans+" "+a+" "+b+" "+ab);


        if(ab>0){
            ans += ab-1;
            if(a>0){
                ans++;
                a--;
            }
            if(b>0){
                ans++;
                b--;
            }
                ans+=Math.min(a, b);
        }else{
            ans+=Math.min(a, b);
        }

        // ans += Math.min(a, b);
        // if (Math.min(a, b) == ab)
        //     ans--;
        // ans += Math.min(a+b-ab,0);

        System.out.println(ans);
    }
}