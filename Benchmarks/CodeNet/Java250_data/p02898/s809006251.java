import java.io.*;
import java.util.*;

public class Main{
    int ans = 1, H, W;
    char[][] maze;
    int[] dr = new int[]{1,0,-1,0}, dc = new int[]{0,1,0,-1};
    static public void main(String[] args) throws Exception{
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ")
        Main main = new Main();
        System.out.println(main.solve());
    }
    int solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int ans = 0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            if(a>=k) ans += 1;
        }
        return ans;
    }

}

