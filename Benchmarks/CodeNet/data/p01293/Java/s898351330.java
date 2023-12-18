import java.util.*;
 
class Main{
 
    void solve(){
        Scanner sc = new Scanner(System.in);
 
        while(true){
            char t = sc.next().charAt(0);
            if(t=='#') break;
 
            char[][] rank = new char[4][13];
            char[][] suit = new char[4][13]; 
            boolean[][] used = new boolean[4][13];
            for(int i=0; i<4; i++){
                for(int j=0; j<13; j++){
                    String s = sc.next();
                    rank[i][j] = s.charAt(0);
                    suit[i][j] = s.charAt(1);
                }
            }
 
            int[] point = new int[2];
            int[] idx = new int[4];
            int turn = 0;
 
            char now = suit[0][0];
            for(int i=0; i<13; i++){
                Arrays.fill(idx, -1);
                for(int j=0; j<13; j++){
                    if(!used[turn][j]){
                        now = suit[turn][j];
                        used[turn][j] = true;
                        idx[turn] = j;
                        break;
                    }
                }
 
                char max = rank[turn][idx[turn]];
                char maxC = now;
                int maxidx = turn;
 
                for(int j=0; j<4; j++){
                    if(j==turn) continue;
                    int fidx = -1;
                    boolean boo = false;
                    for(int k=0; k<13; k++){
                        if(!used[j][k]){
                            if(fidx==-1) fidx = k;
                             
                            if(suit[j][k]==now){
                                boo = true;
                                used[j][k] = true;

                                if(maxC==now && max(rank[j][k], max)){
                                    max = rank[j][k];
                                    maxidx = j;
                                }
                                break;
                            }
                        }
                    }

                    if(!boo){
                        used[j][fidx] = true;
                        if(suit[j][fidx]==t){
                            if(maxC!=t || (maxC==t && max(rank[j][fidx], max))){
                                max = rank[j][fidx];
                                maxidx = j;
                                maxC = t;
                            }
                        }
                    }
                }
                point[maxidx%2]++;
                turn = maxidx;
            }
 
            int ew = point[1] - 6;
            int ns = point[0] - 6;
            if(ew>ns) System.out.println("EW "+ew);
            else System.out.println("NS "+ns);
        }
    }
 
    boolean max(char c1, char c2){
        char[] list = {'2','3','4','5','6','7','8','9','T','J','Q','K','A'};
        int idx1 = 0, idx2 = 0;
        for(int i=0; i<list.length; i++){
            if(c1==list[i]) idx1 = i;
            if(c2==list[i]) idx2 = i;
        }
 
        if(idx1>idx2) return true;
        return false;
    }
 
    public static void main(String[] args){
        new Main().solve();
    }
}