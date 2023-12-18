import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int w = sc.nextInt();
            int d = sc.nextInt();
            if(w==0 && d==0) break;

            int[] front = new int[w];
            int[] side = new int[d];
            for(int i=0; i<w; i++) front[i] = sc.nextInt();
            for(int i=0; i<d; i++) side[i] = sc.nextInt();

            int cnt = 0;
            for(int i=0; i<d; i++){
                boolean boo = false;
                for(int j=0; j<w; j++){
                    if(side[i]==front[j]){
                        front[j] = -1;
                        cnt += side[i];
                        boo = true;
                        break;
                    }
                }
                if(!boo) cnt += side[i];
            }

            for(int i=0; i<w; i++){
                if(front[i]!=-1) cnt += front[i];
            }

            System.out.println(cnt);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}