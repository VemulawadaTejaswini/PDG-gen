import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);


        int n = in.nextInt();
        int d = in.nextInt();
        int[][] a = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                a[i][j] = in.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                double distance = distance(a[i],a[j]);
                if(isInteger(distance)) count++;
            }
        }
        out.println(count);
        out.flush();
    }
    static double distance(int [] a, int [] b) {
        double d = 0;
        for (int i = 0; i < a.length; i++) {
            int temp = (a[i]-b[i])*(a[i]-b[i]);
            d+=temp;
        }
        return Math.sqrt(d);
    }
    static boolean isInteger(double d) {
        return d == (int)d;
    }
    static int f(LinkedList<Integer> q) {
        int size = q.size();
        int count = 0;
        size/=2;
        while (size-->0) {
            int first = q.pollFirst();
            int second = q.pollFirst();
            if(first+second>=10) count++;
            int newValue = (first+second)%10;
            q.addLast(newValue);
        }
        return count;
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

    public Integer nextInt() {
        return Integer.valueOf(next());
    }
    public Long nextLong() {return  Long.valueOf(next());}

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