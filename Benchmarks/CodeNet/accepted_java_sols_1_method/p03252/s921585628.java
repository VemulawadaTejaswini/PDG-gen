import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        String[] s = S.split("");
        String[] t = T.split("");
        String ans = "Yes";
        //Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(int i=0; i<s.length; i++) {
            if(s[i].equals(t[i])) {
                continue;
            }else {
                if(list.contains(t[i]) || list.contains(s[i])) {
                    ans = "No";
                    break;
                }else {
                    S = S.replaceAll(t[i], "#");
                    S = S.replaceAll(s[i], t[i]);
                    S = S.replaceAll("#", s[i]);
                    s = S.split("");
                    list.add(t[i]);
                }
            }
        }
        System.out.println(ans);
    }

}
