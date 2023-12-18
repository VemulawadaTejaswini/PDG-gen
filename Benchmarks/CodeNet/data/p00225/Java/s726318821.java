import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n!=0){
            String[] list = new String[n];
            for(int i=0; i<n; i++) list[i] = sc.next();

            int[] cnt = new int[26];
            int INF = Integer.MAX_VALUE/10;
            int[][] dist = new int[26][26];
            for(int i=0; i<26; i++) Arrays.fill(dist[i], INF);
            for(int i=0; i<n; i++){
                char first = list[i].charAt(0);
                char last = list[i].charAt(list[i].length()-1);
                dist[first-'a'][last-'a'] = 1;
                cnt[first-'a']++; cnt[last-'a']--;
            }

            boolean boo = true;
            int odd = 0;
            for(int i=0; i<26; i++){
                int cnt2 = 0;
                for(int j=0; j<26; j++){
                    if(dist[i][j]==1) cnt2++;
                    if(dist[j][i]==1) cnt2++;
                }
                if(cnt2!=0 && cnt2!=2) boo = false;;
            }
            boo = boo & bfs(dist, list[0].charAt(0)-'a');

            /*
            boolean boo = bfs(dist, list[0].charAt(0)-'a');
            for(int i=0; i<26; i++){
                if(cnt[i]!=0) boo = false;
            }
            */
            if(boo) System.out.println("OK");
            else System.out.println("NG");
            n = sc.nextInt();
        }
    }

    boolean bfs(int[][] dist, int sidx){
        LinkedList<Integer> list = new LinkedList<Integer>();
        boolean[] v = new boolean[dist.length];
        list.add(new Integer(sidx));

        while(list.size()>0){
            int pos = list.poll();

            if(v[pos]) continue;
            v[pos] = true;

            for(int i=0; i<dist.length; i++){
                if(dist[pos][i]==1){
                    list.add(new Integer(i));
                    dist[pos][i] = 0;
                }
            }
        }

        for(int i=0; i<dist.length; i++){
            for(int j=0; j<dist[0].length; j++){
                if(dist[i][j]==1) return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}