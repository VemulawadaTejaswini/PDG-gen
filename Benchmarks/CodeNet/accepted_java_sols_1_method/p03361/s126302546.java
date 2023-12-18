import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int H = sc.nextInt();
        final int W = sc.nextInt();
        String[] S = new String[H];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        for(int i = 0;i < H;i++)    S[i] = sc.next();
        boolean ans = true;
        loop: for(int i = 0;i < H;i++){
            for(int j = 0;j < W;j++){
                char s = S[i].charAt(j);
                if(s == '#'){
                    boolean f = false;
                    for(int k = 0;k < 4;k++){
                        int x = j+dx[k];
                        int y = i+dy[k];
                        if(x >= 0 && x < W && y >= 0 && y < H && S[y].charAt(x) == '#') f = true;
                    }
                    if(!f){
                        ans = false;
                        break loop;
                    }
                }
            }
        }
        if(ans) System.out.println("Yes");
        else    System.out.println("No"); 
    }
}