import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    static void solve() throws Exception {
        int n = scanInt(), q = scanInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scanInt());
        }

        ExecutorService service = Executors.newFixedThreadPool(Integer.MAX_VALUE);
        List<Future<Long>> retList = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int l = scanInt();
            int r = scanInt();
            retList.add(service.submit(new 悪あがき(list.subList(l - 1, r))));
        }
        // 結果待ちのループしている分さらに遅くなってる気がする
        for (int i = 0; i < retList.size(); i++) {
            out.println(retList.get(i).get());
        }
        service.shutdown();
    }
    public static class 悪あがき implements Callable<Long> {
        private List<Integer> list;
        public 悪あがき(List<Integer> list2) {
            this.list = list2;
        }

        @Override
        public Long call() {
            return list.stream().distinct().count();
        }
    }

    static int scanInt() throws IOException {
        return parseInt(scanString());
    }

    static long scanLong() throws IOException {
        return parseLong(scanString());
    }

    static String scanString() throws IOException {
        while (tok == null || !tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
            in.close();
            out.close();
        }
        catch (Throwable e) {
            e.printStackTrace();
            exit(1);
        }
    }
}