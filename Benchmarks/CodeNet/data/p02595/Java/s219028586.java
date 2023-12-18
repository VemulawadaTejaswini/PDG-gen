import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer("");
        String[] s1 = br.readLine().trim().split(" ");
        int n = Integer.parseInt(s1[0]);
        int d = Integer.parseInt(s1[1]);
        int ans=0;
        for(int i=0;i<n;i++){
            String[] s = br.readLine().trim().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            double dis = find(x,y);
            if(dis<=d+.0) ++ans;
        }
        System.out.println(ans);
    }
    static double find(int x, int y) {
        double dis = Math.sqrt((x*1L*x) + (y*1L*y));
        return dis;
    }
}