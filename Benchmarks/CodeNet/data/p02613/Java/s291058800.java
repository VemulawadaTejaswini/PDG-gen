import java.util.*;
import java.io.*;

public class B {

    public static void main(String[] args)throws Exception {
        InputReader in = new InputReader (System.in);
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        // Code starts from here //
        int t = in.nextInt();
        int ac = 0, wa = 0, tle = 0, re = 0;
        for (int i = 0; i < t; i++) {
            String s = in.next();
            if(s.equals("AC")) ac++;
            else if(s.equals("WA")) wa++;
            else if(s.equals("TLE")) tle++;
            else if(s.equals("RE")) re++;
        }
        pw.printf("AC x %d\n", ac);
        pw.printf("WA x %d\n", wa);
        pw.printf("TLE x %d\n", tle);
        pw.printf("RE x %d\n", re);


        pw.close();
    }





    /****************************************
     ******* IO STUFF STARTS FROM HERE ******
     ****************************************/

    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString
                (obj));
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new
                    InputStreamReader(stream));
            tokenizer = null;
        }

        //InputReader in = new InputReader(new FileReader("File_Name"));
        public InputReader(FileReader file) {
            reader = new BufferedReader(file);
            tokenizer = null;
        }

        public String next() {

            try {
                while (tokenizer == null || !
                        tokenizer.hasMoreTokens())
                    tokenizer = new StringTokenizer
                            (reader.readLine());
            } catch (IOException e) {
                return null;
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            String line = null;
            try {
                tokenizer = null;
                line =  reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return line;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public boolean hasNext(){
            try {
                while (tokenizer == null || !
                        tokenizer.hasMoreTokens())
                    tokenizer = new StringTokenizer
                            (reader.readLine());
            }
            catch (Exception e) {
                return false;
            }
            return true;
        }
    }
}