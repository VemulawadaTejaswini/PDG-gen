import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] Args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        final int f[] = new int[45];
        f[0] = f[1] = 1;
        for(int i = 2; i<=n; i++)
            f[i] = f[i-1]+f[i-2];
        System.out.println(f[n]);
    }
}