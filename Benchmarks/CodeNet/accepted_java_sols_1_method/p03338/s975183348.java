import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        HashSet<String> hs = new HashSet<>();
        for(int i = 0; i < n; i++){
            hs.add(s.substring(i,i+1));
        }
        int[] kinds = new int[n];
        for(String c : hs){
            int f = s.indexOf(c);
            int l = s.lastIndexOf(c);
            if(f == l){
                continue;
            }
            for(int i = f; i < l; i++){
                kinds[i]++;
            }
        }
        int ans = 0;
        for(int k : kinds){
            ans = Math.max(ans,k);
        }
        System.out.println(ans);
    }
}