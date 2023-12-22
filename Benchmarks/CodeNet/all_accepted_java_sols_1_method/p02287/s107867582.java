import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] Args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        final int[] h = new int[n+1];
        final StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 1; i<=n; i++){
            h[i] = Integer.parseInt(st.nextToken());
        }
        final StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=n; i++){
            sb.append("node ").append(i).append(": key = ").append(h[i]).append(", ");
            if(i>1) sb.append("parent key = ").append(h[i>>>1]).append(", ");;
            if(i+i<=n) sb.append("left key = ").append(h[i+i]).append(", ");
            if(i+i<n) sb.append("right key = ").append(h[i+i+1]).append(", ");
            sb.append('\n');
        }
        System.out.print(sb);
    }
}