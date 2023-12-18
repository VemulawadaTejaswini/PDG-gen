import java.io.*;
import java.util.*;
public class Main {
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String line;
    static  int n,k,T,N,m;
    static StringTokenizer st;
    static Scanner in = new Scanner(System.in);
    static char [] word;
    public static void main(String[] args) throws IOException {
        line=br.readLine();
        for (int i=0;i<line.length();i++){
            if (line.charAt(i)=='A')
                k++;
            if (line.charAt(i)=='B')
                n++;
        }
        pw.println(n>0&&k>0?"Yes":"No");
        pw.flush();

    }
}