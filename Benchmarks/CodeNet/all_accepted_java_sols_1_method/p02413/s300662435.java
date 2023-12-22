import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cr = sc.nextLine().split(" ");
        int c = Integer.parseInt(cr[0]); int r = Integer.parseInt(cr[1]);
        int[][] l = new int[c+1][r+1]; 
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < c;i++ ){
            String str = sc.nextLine();
            String[] tmp = str.split(" ");
            for(int j = 0; j < r;j++ ){
                int n = Integer.parseInt(tmp[j]);
                l[c][j]+=n; l[i][r]+=n; l[c][r]+=n;
            }
            sb.append(str+" "+l[i][r]+"\n");
        }
        for(int j = 0; j <= r;j++ ){
            if(j!=0) sb.append(" ");
            sb.append(l[c][j]);
        }
        System.out.println(sb);
    }
}
