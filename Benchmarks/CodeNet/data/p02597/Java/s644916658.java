import java.io.*;
import java.util.*;

public class Main {

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tok;

        public InputReader(InputStream inputStream) {
            reader = new BufferedReader(new InputStreamReader(inputStream));
            tok = null;
        }

        public InputReader(String inputFile) throws FileNotFoundException {
            reader = new BufferedReader(new FileReader(inputFile));
            tok = null;
        }

        public String nextLine() {
            String c = "";
            try {
                c = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            return c;
        }

        public String next() {
            while (tok == null || !tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(nextLine());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String args[]) {
        InputStream inputstream = System.in;
        OutputStream outputstream = System.out;
        InputReader in = new InputReader(inputstream);
        PrintWriter out = new PrintWriter(outputstream);
        Task solver = new Task();
        solver.solve(in, out);
        out.flush();
    }

    static class Task {
        public void solve(InputReader in, PrintWriter out) {
            int n = in.nextInt();
            String colors=in.next();
            int whites=0,swaps=0;
             for(char c:colors.toCharArray()){
                if(c=='W') whites++;
            }
            if(whites==0)
            out.println(swaps);
            else{
                int i=0,j=n-1;
            while(i<j){
                if(colors.charAt(i)=='W' && colors.charAt(j)=='R'){
                    swaps++;
                    i++;
                    j--;
                }
                else if(colors.charAt(i)=='R') i++;
                else if(colors.charAt(j)=='W') j++;
            }
            }
            
            out.println(swaps);
        }
    }
}
                
                