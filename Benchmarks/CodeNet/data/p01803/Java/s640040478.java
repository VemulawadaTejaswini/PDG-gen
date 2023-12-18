import java.util.*;

public class Main {
    private static final String VOWEL = "aeiou";

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n;
        while((n = scn.nextInt()) > 0) {
            int max = 0;
            List<String> list = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                String str = scn.next();
                max = Math.max(max, str.length());
                list.add(str);
            }

            int ans = 0;
            Set<String> set;
            while(++ans <= max) {
                set = new HashSet<>();
                for(String str : list) {
                    set.add(encode(str, ans));
                }
                if(set.size() == n) {
                    break;
                }
            }

            System.out.println(ans > max ? -1 : ans);
        }
    }

    private static String encode(String str, int len) {
        StringBuilder sb = new StringBuilder();
        boolean flg = true;
        for(char elm : str.toCharArray()) {
            if(flg) {
                sb.append(elm);
                flg = false;
            }
            if(VOWEL.indexOf(elm) >= 0) {
                flg = true;
            }
        }
        return sb.toString().substring(0, Math.min(len, sb.length()));
    }
}