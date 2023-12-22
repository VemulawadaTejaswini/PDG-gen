import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main{
    public static void main(String[] args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final PrintStream out = new PrintStream(System.out);
        br.readLine();
        String[] in = br.readLine().split(" ");
        final boolean[] sum = new boolean[2001];
        sum[0] = true;
        for(final String e:in){
            final int a = Integer.parseInt(e);
            for(int i = 2000-a; i>=0; i--){
                if(sum[i]) sum[i+a] = true;
            }
        }
        br.readLine();
        in = br.readLine().split(" ");
        for(final String e:in){
            out.println(sum[Integer.parseInt(e)] ? "yes" : "no");
        }
        out.flush();
    }
}