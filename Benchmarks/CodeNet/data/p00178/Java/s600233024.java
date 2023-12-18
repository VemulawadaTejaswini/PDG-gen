import java.util.*;

class Main{

    int[][] tetoris;
    int[] height;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0) break;

            tetoris = new int[5001][5];
            height = new int[5];

            int num = 1;
            for(int i=0; i<n; i++){
                int d = sc.nextInt();
                int p = sc.nextInt();
                int q = sc.nextInt()-1;
                if(d==1){
                    down(q, p);
                }else{
                    for(int j=0; j<p; j++){
                        down(q, 1);
                    }
                }
            }

            int cnt = 0;
            for(int i=0; i<5000; i++){
                for(int j=0; j<5; j++){
                    if(tetoris[i][j]>=1) cnt++;
                }
            }

            System.out.println(cnt);
        }
    }

    void down(int pos, int length){
        int maxHeight = height[pos];
        for(int i=0; i<length; i++){
            maxHeight = Math.max(maxHeight, height[pos+i]);
        }
        maxHeight++;
        for(int i=0; i<length; i++){
            tetoris[maxHeight][pos+i] = 1;
            height[pos+i] = maxHeight;
        }

        int maxH = 0;
        for(int j=0; j<5; j++) maxH = Math.max(maxH, height[j]);

        for(int i=0; i<=maxHeight; i++){
            boolean boo = true;
            for(int j=0; j<5; j++) if(tetoris[i][j]==0) boo = false;
            
            if(boo){
                for(int j=i; j<=maxH+1; j++){
                    for(int k=0; k<5; k++){
                        tetoris[j][k] = tetoris[j+1][k];
                    }
                }

                Arrays.fill(height, -1);
                for(int j=0; j<5; j++){
                    for(int k=maxH; k>=0; k--){
                        if(tetoris[k][j]!=0){
                            height[j] = k;
                            break;
                        }
                    }
                }
                maxHeight--;
            }
        }        
    }

    public static void main(String[] args){
        new Main().solve();
    }
}