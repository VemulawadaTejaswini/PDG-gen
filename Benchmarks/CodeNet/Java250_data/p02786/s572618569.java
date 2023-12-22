import java.io.*;
import java.util.*;

public class Main {
    public static HashMap<Long, Long> map;

    public static void main(String args[]) {
        InputOutput io = new InputOutput(System.in, System.out);
        long h = io.l();
        map = new HashMap<>();
        io.pln(hit(h));
        io.flush();
    }
    
    public static long hit(long h) {
        if (h == 1)
            return 1;
        if (map.containsKey(h))
            return map.get(h);
        long ans = hit((long) Math.floor(h / 2)) + hit((long) Math.floor(h / 2)) + 1;
        map.put(h, ans);
        return ans;
    }

    public static class InputOutput {
        private BufferedReader br;
        private StringTokenizer tok;
        private PrintWriter pw;

        InputOutput(InputStream inputStream, OutputStream outputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
            pw = new PrintWriter(new OutputStreamWriter(outputStream));
        }

        public String s() {
            while (tok == null || !tok.hasMoreElements()) {
                try {
                    tok = new StringTokenizer(br.readLine());
                } catch (IOException exc) {
                    exc.printStackTrace();
                }
            }
            return tok.nextToken();
        }

        public int i() {
            return Integer.parseInt(this.s());
        }

        public long l() {
            return Long.parseLong(this.s());
        }

        public void p(Object... out) {
            for (Object e : out)
                pw.print(e.toString());
        }

        public <T> void pln(T out) {
            pw.println(out);
        }

        public void pln() {
            pw.println();
        }

        public void flush() {
            pw.flush();
        }
    }
}