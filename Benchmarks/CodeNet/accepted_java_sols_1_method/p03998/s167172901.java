import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sa = sc.next();
        String sb = sc.next();
        String scc = sc.next();
        int[] idx = new int[3];
        String[] can = new String[]{sa,sb,scc};
        int cur = 0;
        while(idx[cur]<can[cur].length()){
            int next = can[cur].charAt(idx[cur])-'a';
            idx[cur]++;
            cur=next;
        }
        String[] res = new String[]{"A","B","C"};
        System.out.println(res[cur]);
    }
}
