import java.util.*;

public class Main{

    int w,d;
    int[] front,side;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            w = sc.nextInt();
            d = sc.nextInt();
            if(w==0 && d==0) break;
            front = new int[w];
            side = new int[d];
            for(int i=0; i<w; i++) front[i] = sc.nextInt();
            for(int i=0; i<d; i++) side[i] = sc.nextInt();

            Arrays.sort(front);
            Arrays.sort(side);

            int block = 0;
            int idxF = w-1, idxS = d-1;
            while(idxF>=0 && idxS>=0){
                if(front[idxF]==side[idxS]){
                    block += front[idxF];
                    idxF--;
                    idxS--;
                }else if(front[idxF]>side[idxS]){
                    block += front[idxF];
                    idxF--;
                }else{
                    block += side[idxS];
                    idxS--;
                }
            }
            
            for(int i=idxF; i>=0; i--) block += front[i];
            for(int i=idxS; i>=0; i--) block += side[i];
            
            System.out.println(block);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}