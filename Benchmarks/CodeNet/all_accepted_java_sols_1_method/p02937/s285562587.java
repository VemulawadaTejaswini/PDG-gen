import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        
        TreeSet<Integer>[] al = new TreeSet[26];
        for(int i=0; i<26; i++){
            al[i] = new TreeSet<>();
        }
        
        int len = s.length;
        for(int i=0; i<len; i++){
            int idx = s[i]-97;
            al[idx].add(i);
        }
        
        long ans = 0L;
        int cur = -1;
        for(int i=0; i<t.length; i++){
            int idx = t[i]-97;
            Integer next = al[idx].higher(cur);
            if(next==null && al[idx].size()==0){
                System.out.println(-1);
                return;
            }else if(next==null){
                ans += len-cur-1;
                next = al[idx].higher(-1);
                ans += next+1;
                cur = next;
            }else{
                ans += next-cur;
                cur = next;
            }
        }
        
        System.out.println(ans);
        
    }
}
