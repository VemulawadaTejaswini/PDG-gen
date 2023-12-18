import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] Args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        final int z[][] = new int[1001][1001];
        for(int i = 0; i<n; i++){
            final String x = br.readLine();
            final int xl = x.length();
            final String y = br.readLine();
            final int yl = y.length();
            for(int j = 0; j<=xl; j++)
                z[xl][0] = 0;
            for(int j = 0; j<=yl; j++)
                z[0][yl] = 0;
            for(int j = 1; j<=xl; j++){
                for(int k = 1; k<=yl; k++){
                    if(x.charAt(j-1)==y.charAt(k-1)) z[j][k] = z[j-1][k-1]+1;
                    else z[j][k] = Math.max(z[j-1][k], z[j][k-1]);
                }
            }
            System.out.println(z[xl][yl]);
        }
    }
}