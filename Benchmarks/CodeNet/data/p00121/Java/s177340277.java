import java.util.*;
 
public class Main{
 
    int[] v;
    int[] dx = {0,0,1,-1};
    int[] dy = {1,-1,0,0};
 
    void solve(){
        Scanner sc = new Scanner(System.in);

        calc();
 
        while(sc.hasNext()){
            String pzl = "";
            for(int i=0; i<2; i++){
                for(int j=0; j<4; j++){
                    pzl += sc.next();
                }
            }

            int ans = v[Integer.parseInt(pzl.substring(0,7))];
 
            System.out.println(ans);
        }
    }
 
    class P{
        String pzz;
        int x,y,cnt;
        P(String pzz, int x, int y, int cnt){
            this.pzz = pzz;
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
 
    void calc(){
        Queue<P> q = new LinkedList<P>();
        q.add(new P("01234567",0,0,0));
        v = new int[7654322];
        Arrays.fill(v,-1);
 
        while(q.size()>0){
            P pp = q.poll();
            String pzz = pp.pzz;
            int x = pp.x, y = pp.y, cnt = pp.cnt;
  
            int num = Integer.parseInt(pzz.substring(0,7));
            if(v[num]!=-1) continue;
            v[num] = cnt;
 
            char[] c = pzz.toCharArray();
 
            for(int i=0; i<4; i++){
                int nx = x+dx[i], ny = y+dy[i];
                if(nx<0 || nx>=4 || ny<0 || ny>=2) continue;
                c[y*4+x] = c[ny*4+nx];
                c[ny*4+nx] = '0';
                String ns = String.valueOf(c);
                q.add(new P(ns,nx,ny,cnt+1));
                c[ny*4+nx] = c[y*4+x];
                c[y*4+x] ='0';
            }
        }
    }
 
    public static void main(String[] args){
        new Main().solve();
    }
}