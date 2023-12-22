import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        int[][] g = new int[h][w];
        for(int i=0; i<h; i++) {
            char[] c = sc.next().toCharArray();
            for(int j=0; j<w; j++) {
                if(c[j] == '#') g[i][j] = 1;
            }
        }

        int res = 0;
        for(int i=0; i<(1<<h); i++) {
            for(int j=0; j<(1<<w); j++) {
                int sum = 0;
                for(int a = 0; a < h; a ++) {
                    for(int b = 0; b< w; b++) {
                        if((i>>a) %2 == 1 && (j>>b) %2 ==1) sum+=g[a][b];
                    }
                }
                if(sum == k) res++;
            }
        }
        System.out.println(res);

    }


}