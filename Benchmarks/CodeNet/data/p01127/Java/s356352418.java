import java.util.*;

class Main{

    int w, h;
    char[][] bag;
    ArrayList<Character> list;
    ArrayList<int[]> seven;
    boolean[] used;
    int[] order;

    void solve(){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T-->0){
            h = sc.nextInt();
            w = sc.nextInt();
            bag = new char[h][w];
            list = new ArrayList<Character>();
            for(int i=0; i<h; i++){
                String s = sc.next();
                for(int j=0; j<w; j++){
                    bag[i][j] = s.charAt(j);
                    if(!list.contains(bag[i][j]) && bag[i][j]!='.') list.add(bag[i][j]);
                }
            }
            
            seven = new ArrayList<int[]>();
            used = new boolean[list.size()];
            order = new int[list.size()];
            dfs(0);
            
            if(!boo()) System.out.println("SUSPICIOUS");
            else System.out.println("SAFE");
        }
    }


    void dfs(int cnt){
        if(cnt==list.size()){
            int[] neworder = new int[list.size()];
            for(int i=0; i<list.size(); i++) neworder[i] = order[i];
            seven.add(neworder);
            return;
        }

        for(int i=0; i<list.size(); i++){
            if(used[i]) continue;
            used[i] = true;
            order[cnt] = i;
            dfs(cnt+1);
            used[i] = false;
        }
    }

    boolean boo(){
        boolean boo = true;
        for(int ii=0; ii<seven.size(); ii++){
            boo = true;
            for(int i=0; i<list.size(); i++){
                int minX = 100, maxX = 0;
                int minY = 100, maxY = 0;
                for(int j=0; j<h; j++){
                    for(int k=0; k<w; k++){
                        if(bag[j][k]==list.get(i)){
                            minX = Math.min(minX, k);
                            maxX = Math.max(maxX, k);
                            minY = Math.min(minY, j);
                            maxY = Math.max(maxY, j);
                            
                        }
                    }
                }
                for(int l=minY; l<=maxY; l++){
                    for(int m=minX; m<=maxX; m++){
                        if(bag[l][m]!=list.get(i)){
                            if(bag[l][m]=='.'){
                                boo = false;
                                break;
                            }
                            int idx1 = 0, idx2 = 0;
                            for(int jj=0; jj<list.size(); jj++){
                                int[] po = seven.get(ii);
                                if(po[jj]==i) idx1 = jj;
                                if(po[jj]==list.indexOf(bag[l][m])) idx2 = jj;
                            }
                            if(idx1>idx2){
                                boo = false;
                                break;
                            }
                        }
                    }
                    if(!boo) break;
                }

            } 
            if(boo) return true;   
        }
        return false;
    }
        
    public static void main(String[] args){
        new Main().solve();
    }
}