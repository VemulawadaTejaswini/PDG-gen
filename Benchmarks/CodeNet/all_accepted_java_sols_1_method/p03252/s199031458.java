import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        int len = s.length;
        HashMap<Character, Character> sl = new HashMap<>();
        HashMap<Character, Character> tl = new HashMap<>();
        boolean check = true;
        for(int i = 0; i < len; i++){
            if(sl.containsKey(s[i]) && sl.get(s[i]) != t[i] || tl.containsKey(t[i]) && tl.get(t[i]) != s[i]){
                check = false;
                break;
            }
            sl.put(s[i],t[i]);
            tl.put(t[i],s[i]);
        }
        System.out.println(check ? "Yes" : "No");
    }
}
