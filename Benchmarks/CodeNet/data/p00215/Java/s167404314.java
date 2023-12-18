import java.util.*;

@SuppressWarnings("unchecked")
class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int w =  sc.nextInt(), h = sc.nextInt();
            if(w==0 && h==0) break;

            int sx = 0, sy = 0, gx = 0, gy = 0;
            ArrayList[] list = new ArrayList[5];
            for(int i=0; i<5; i++) list[i] = new ArrayList<int[]>();

            for(int i=0; i<h; i++){
                char[] line = sc.next().toCharArray();
                for(int j=0; j<w; j++){
                    if(line[j]=='S') {sx = j; sy = i;}
                    if(line[j]=='G') {gx = j; gy = i;}
                    if(Character.isDigit(line[j])) list[line[j]-'1'].add(new int[]{j, i});
                }
            }

            int INF = Integer.MAX_VALUE/2;
            int idx = 0; int min = INF;
            for(int start=0; start<5; start++){
                int[][] dp = new int[5][];
                for(int i=1; i<=4; i++){
                    int now = (start + i) % 5;
                    int before = (now + 4) % 5;
                    dp[now] = new int[list[now].size()];
                    Arrays.fill(dp[now], INF);
                    for(int j=0; j<list[now].size(); j++){
                        int[] pos = (int[])list[now].get(j);
                        if(i==1){
                            dp[now][j] = Math.abs(sx - pos[0]) + Math.abs(sy - pos[1]);
                            continue;
                        }
                        for(int k=0; k<list[before].size(); k++){
                            int[] pos2 = (int[])list[before].get(k);
                            int dist = dp[before][k] + Math.abs(pos[0] - pos2[0]) 
                                + Math.abs(pos[1] - pos2[1]);
                            if(i==4){
                                dist += Math.abs(gx - pos[0]) + Math.abs(gy - pos[1]);
                                if(dist<min){
                                    min = dist;
                                    idx = start + 1;
                                }
                            }
                            dp[now][j] = Math.min(dp[now][j], dist);
                        }
                    }
                }
            }
            if(min==INF) System.out.println("NA");
            else System.out.println(idx+" "+min);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}