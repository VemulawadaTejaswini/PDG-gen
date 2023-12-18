import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final StringBuilder sb = new StringBuilder();
        final int n = Integer.parseInt(br.readLine());
        final String[] in = br.readLine().split(" ");
        final int[] c = new int[10001];
        for(int i = 0; i<n; i++)
            c[Integer.parseInt(in[i])]++;
        for(int i = 0; i<=10000; i++)
            for(int j = 0; j<c[i]; j++)
                sb.append(i).append(' ');
        sb.setCharAt(sb.length()-1, '\n');
        System.out.print(sb);
    }
}