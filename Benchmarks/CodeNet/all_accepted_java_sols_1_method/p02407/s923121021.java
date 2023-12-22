import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Main{
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] Args) throws IOException{
        Integer.parseInt(br.readLine());
        final String[] a = br.readLine().split(" ");
        for(int i = a.length-1; i>=0; i--){
            out.print(a[i]);
            if(i!=0) out.print(' ');
        }
        out.println();
        out.flush();
    }
}