import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int k = sc.nextInt();
        for (int i = 0; i < s.length; i++) {
            if(s[i] == 'a') continue;
            int x = (int)'z' + 1 - (int)s[i];
            if(k < x) continue;
            else {
                s[i] = 'a';
                k -= x;
            }
        }
        if(0 < k){
            int x = (int)'z' + 1 - (int)s[s.length-1];
            if(k < x){
                s[s.length-1] = (char)((int)s[s.length-1] + k);
            }else{
                k -= x; k %= 26;
                s[s.length-1] = (char)((int)'a' + k);
            }
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        };
        System.out.println();
        sc.close();

    }

}
