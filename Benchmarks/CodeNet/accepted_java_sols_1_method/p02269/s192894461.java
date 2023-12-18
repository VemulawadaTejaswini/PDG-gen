import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.BitSet;

class Main{
    public static void main(String[] args) throws IOException{
        final PrintWriter out = new PrintWriter(System.out);
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BitSet dict = new BitSet(33554432);
        final char[] key = new char[128];
        key['A'] = 0;
        key['C'] = 1;
        key['G'] = 2;
        key['T'] = 3;
        final int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            final String line = br.readLine();
            if(line.charAt(0)=='i'){
                int hash = 1;
                for(int j = 7; j<line.length(); j++){
                    hash <<= 2;
                    hash += key[line.charAt(j)];
                }
                dict.set(hash);
            }else{
                int hash = 1;
                for(int j = 5; j<line.length(); j++){
                    hash <<= 2;
                    hash += key[line.charAt(j)];
                }
                out.println(dict.get(hash) ? "yes" : "no");
            }
        }
        out.flush();
    }
}