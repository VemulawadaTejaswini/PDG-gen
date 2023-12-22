import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] s = S.split("");
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < 4; i++) {
            if(map.containsKey(s[i])) {
                map.put(s[i], map.get(s[i])+1);
            }else {
                map.put(s[i], 1);
            }
        }
        
        String ans = "Yes";
        for(int i = 0; i < 4; i++) {
            if(map.get(s[i]) == 2) {
                continue;
            }else {
                ans = "No";
                break;
            }
        }
        
        System.out.println(ans);
        
    }
}