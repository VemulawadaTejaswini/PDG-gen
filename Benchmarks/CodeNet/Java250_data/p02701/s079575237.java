import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

public class Main{
    //WRWWRWRR     wwwrrrrwwwwrrr
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        String[] ss = new String[n];
        Set<String> res = new HashSet<>();
        for(int i=0;i<n;i++){
            res.add(in.next());
        }
        out.println(res.size());

    }
    //	public static void main(String[] args){
//		Scanner scanner = new Scanner(new InputStreamReader(System.in));
//		int n  = Integer.parseInt(scanner.nextLine());
//		String s = scanner.nextLine();
//		LinkedList<Integer> q = new LinkedList<>();
//		for(int i=0;i<n;i++){
//			if(s.charAt(i)=='W'){
//				q.add(i);
//			}
//		}
//		int res = 0;
//		for(int i=n-1;i>=0;i--){
//			if(q.size()==0) break;
//			if(s.charAt(i)=='R'){
//				int v = q.poll();
//				if(v>i) break;
//				res++;
//			}
//		}
//		System.out.println(res);
//
//	}
    public static void main(String[] args){
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Main solver = new Main();
//        int num = in.nextInt();
//        while(num-->0){
//            solver.solve(1, in, out);
//        }
        solver.solve(1, in, out);
        out.close();
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

    }
}