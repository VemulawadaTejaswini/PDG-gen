import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int len = s.length;
        char prev = s[0];
        int cnt = 1;
        ArrayList<Integer> li = new ArrayList<Integer>();
        long n = sc.nextLong();
        for(int i = 1; i < len; i++){
            if(prev == s[i]){
                cnt++;
            } else {
                li.add(cnt);
                cnt = 1;
                prev = s[i];
            }
        }
        li.add(cnt);
        long ans = 0;
        if(li.size() == 1){
            ans = (li.get(0)*n)/2;
        }else if(s[0] == s[len-1]){
            int cf = li.get(0);
            int cl = li.get(li.size()-1);
            for(int i = 1; i < li.size()-1; i++){
                ans += li.get(i)/2 * n;
            }
            ans += cf/2 + cl/2 + (cf+cl)/2*(n-1); 
        }else{
            for(int i : li){
                ans += i/2 * n;
            }
        }
        System.out.println(ans);
    }
}
