import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.call(in,out);
        out.close();
    }

    static class TaskA {
        public void call(InputReader in, PrintWriter out) {
            int n,m,k;
            int sum=0;
            n = in.nextInt();
            m = in.nextInt();
            k = in.nextInt();
            int[] arr = new int[n];
            int[] array = new int[m];
            for (int i = 0; i <n ; i++) {
                arr[i] = in.nextInt();
            }
            for (int i = 0; i <m ; i++) {
                array[i]= in.nextInt();
            }
            Arrays.sort(array);
            Arrays.sort(arr);
            int i =0, j =0 , count=0;
            for (int l = 0; l <n+m; l++) {
                if(arr[i]>array[j]){
                    sum+=array[j];
                    if((j+1)!=array.length)
                       j++;
                }
                else{
                    sum+=arr[i];
                    if((i+1)!=arr.length)
                        i++;
                }
                if(sum<=k)
                    count++;
                else
                    break;

            }
            out.println(count);






        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }


    }
}