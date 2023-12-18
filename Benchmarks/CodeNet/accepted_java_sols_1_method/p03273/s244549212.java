import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        String[][] map = new String[N][W];
        int[] gyo = new int[N];
        int[] retu = new int[W];
        for(int i=0; i<N; i++) {
            String S = sc.next();
            map[i] = S.split("");
            for(int j=0; j<W; j++) {
                if(map[i][j].equals("#")) {
                    gyo[i] = 1;
                    retu[j] = 1;
                }
            }
        }
        
        for(int i=0; i<N; i++) {
            if(gyo[i] == 0) continue;
            for(int j=0; j<W; j++) {
                if(retu[j] == 0) continue;
                System.out.print(map[i][j]);
            }
            System.out.println("");
        }

    }
}