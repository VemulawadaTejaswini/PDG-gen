import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);
        Scanner scanner = new Scanner(System.in);

        int n = in.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]= in.nextInt();
        }
        int ans = 0;
        int active = 0;
        for (int i = 0; i < a.length ; i++) {
            if(active>=a[i]) {
                active = a[i];
            }
            else {
                ans+=a[i]-active;
                active = a[i];
            }
        }
        out.println(ans);
        out.flush();

    }
    static int f(int n) {
        if(n%2==0) return n/2;
        return 3*n+1;
    }
    static boolean check(char [] ca,char [] cb) {
        for (char c = 'a';c<='z';c++) {
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < ca.length; i++) {
                if(ca[i] == c) {
                    set.add(cb[i]);
                }
                if(set.size() > 1) {
                    return false;
                }
            }
        }
        return  true;
    }
    private static boolean check(LinkedHashMap<Character,Integer> m1,LinkedHashMap<Character,Integer> m2) {
        if(m1.size()!=m2.size()) return false;
        Set<Map.Entry<Character,Integer>> s = m2.entrySet();
        Iterator<Map.Entry<Character,Integer>> it = s.iterator();
        for(Map.Entry<Character,Integer> m : m1.entrySet()) {
            Map.Entry<Character,Integer> next = it.next();
            if(m.getKey()!=next.getKey()) return false;
            else {
                if(m.getValue() < next.getValue()) return false;
                else {
                    if(m.getValue() > next.getValue()) {
                        if(m.getValue() < 3) return false;
                    }
                }
            }
        }
        return true;
    }
}

class Envelope {
    private int width;
    private int height;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Envelope(int width,int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return width + " " + height;
    }
}

class InputReader extends BufferedReader {
    StringTokenizer tokenizer;

    public InputReader(InputStream inputStream) {
        super(new InputStreamReader(inputStream), 32768);
    }

    public InputReader(String filename) {
        super(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(filename)));
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(readLine());
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return tokenizer.nextToken();
    }
    public Integer nextInt() {return Integer.valueOf(next());}
    public Long nextLong() {return  Long.valueOf(next());}
    public Double nextDouble() {return Double.valueOf(next());}

    static class OutputWriter extends PrintWriter {
        public OutputWriter(OutputStream outputStream) {
            super(outputStream);
        }

        public OutputWriter(Writer writer) {
            super(writer);
        }

        public OutputWriter(String filename) throws FileNotFoundException {
            super(filename);
        }

        public void close() {
            super.close();
        }
    }
}