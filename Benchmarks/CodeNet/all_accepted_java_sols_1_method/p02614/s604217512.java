import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        var c = new char[h][w];
        for(int i = 0; i < h; i++){
            c[i] = sc.next().toCharArray();
        }
        
        int ans = 0;
        for(int i = 0; i < 1<<h; i++){
            for(int j = 0; j < 1<<w; j++){
                int count = 0;
                for(int l = 0; l < h; l++){
                    if((i & (1<<l)) != 0) continue;
                    for(int m = 0; m < w; m++){
                        if((j & (1<<m)) != 0) continue;
                        if(c[l][m] == '#') count++;
                    }
                }
                if(count == k) ans++;
            }
        }
        System.out.println(ans);
    }
}