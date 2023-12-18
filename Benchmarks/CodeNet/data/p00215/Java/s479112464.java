import java.util.*;

@SuppressWarnings("unchecked")
class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int INF = Integer.MAX_VALUE/2;

        while(true){
            int w = sc.nextInt(), h = sc.nextInt();
            if(w==0 && h==0) break;
            ArrayList[] list = new ArrayList[5];
            for(int i=0; i<5; i++) list[i] = new ArrayList<int[]>();

            int sx = 0, sy = 0, gx = 0, gy = 0;
            for(int i=0; i<h; i++){
                char[] line = sc.next().toCharArray();
                for(int j=0; j<w; j++){
                    if(line[j]=='S'){ sx = j; sy = i;}
                    else if(line[j]=='G'){ gx = j; gy = i;}
                    else if(Character.isDigit(line[j])) list[line[j]-'1'].add(new int[]{j, i});
                }
            }

            int num = 0, min = INF;
            for(int start=0; start<5; start++){
                int[][] dp = new int[5][];
                int idx = (start+1) % 5;
                while(idx!=start){
                    dp[idx] = new int[list[idx].size()];
                    Arrays.fill(dp[idx], INF);
                    for(int j=0; j<list[idx].size(); j++){
                        int[] xy = (int[])list[idx].get(j);
                        if(idx==(start+1)%5){
                            dp[idx][j] = Math.min(dp[idx][j], Math.abs(sx - xy[0]) + Math.abs(sy - xy[1]));
                            continue;
                        }
                        int before = (idx+4) % 5;
                        for(int k=0; k<list[before].size(); k++){
                            int[] xy2 = (int[])list[before].get(k);
                            int dist = dp[before][k] + Math.abs(xy[0] - xy2[0]) + Math.abs(xy[1] - xy2[1]);
                            if((idx+1)%5==start){
                                dist += Math.abs(gx - xy[0]) + Math.abs(gy - xy[1]);
                                if(dist<min){
                                    min = dist;
                                    num = start+1;
                                }
                            }
                            dp[idx][j] = Math.min(dp[idx][j], dist);
                        }
                    }
                    idx = (idx + 1) % 5;
                }
            }
            if(min==INF) System.out.println("NA");
            else System.out.println(num+" "+min);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}