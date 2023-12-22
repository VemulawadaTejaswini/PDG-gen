import java.util.Scanner;

// 18
public class Main{

    public static void main(String[] args) {
        String s = (new Scanner(System.in)).next();
        char[] acgt = {'A', 'C', 'G', 'T'};

        int ans = 0;
        int tmp1 = 0;
        for(int i = 0; i < s.length(); i++) {
            int tmp2 = tmp1;
            for(int j = 0; j < acgt.length; j++) {
                if(s.charAt(i) == acgt[j]) {
                    ++tmp1;
                    break;
                }
            }
            if(tmp1 == tmp2) {
                ans = Math.max(ans, tmp1);
                tmp1 = 0;
            }
        }
        ans = Math.max(ans, tmp1);

        System.out.println(ans);
    }

}
