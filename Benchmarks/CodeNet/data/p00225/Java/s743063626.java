import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            
            boolean[][] alpha = new boolean[26][26];
            boolean[] used = new boolean[26];
            int[] deg = new int[26];
            for(int i=0; i<n; i++){
                char[] in = sc.next().toCharArray();
                int first = (int)(in[0] - 'a');
                int last = (int)(in[in.length-1] - 'a');
                alpha[first][last] = true;
                used[first] = used[last] = true;
                deg[first]--;
                deg[last]++;
            }
            
            boolean boo = true;
            for(int i=0; i<n; i++){
                if(deg[i]!=0) boo = false;
            }
            if(!boo){
                System.out.println("NG");
                continue;
            }
            
            for(int k=0; k<26; k++)
                for(int i=0; i<26; i++)
                    for(int j=0; j<26; j++)
                        alpha[i][j] |= alpha[i][k] & alpha[k][j];
            
            for(int i=0; i<26; i++){
                for(int j=0; j<26; j++){
                    if(used[i] && used[j]){
                        if(!alpha[i][j]) boo = false;
                    }
                }
            }
            if(!boo) System.out.println("NG");
            else System.out.println("OK");
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}