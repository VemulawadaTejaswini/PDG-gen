import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;
class InputReader {
    BufferedReader buf;
    StringTokenizer tok;
 
    public InputReader() {
        buf = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            Path currentRelativePath = Paths.get("");
//            String s = currentRelativePath.toAbsolutePath().toString();
//            String curDir = System.getProperty("user.dir");
//            System.out.println("current dir: " + s);
//            buf = new BufferedReader(new FileReader("/Users/wangdong/Dropbox/LC_Java/src/test/resources/testA.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }
 
    public boolean hasNext() {
        while (tok == null || !tok.hasMoreElements()) {
            try {
                tok = new StringTokenizer(buf.readLine());
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
 
    public String next() {
        if (hasNext()) return tok.nextToken();
        return null;
    }
 
    public int nextInt() {
        return Integer.parseInt(next());
    }
 
    public long nextLong() {
        return Long.parseLong(next());
    }
 
    public  Double nextDouble() {
        return Double.parseDouble(next());
    }
 
    public BigInteger nextBigInteger() {
        return new BigInteger(next());
    }
 
    public BigDecimal nextBigDecimal() {
        return new BigDecimal(next());
    }
}
 
 
public class Main {
  public static void main(String[] args) {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
     	int[] p = new int[n+1];
    	p[1] = -1;
    	int[] cnt = new int[n+1];
    	for (int i = 2; i <=n; i++) {
          p[i] = in.nextInt();
          cnt[p[i]] += 1;
        }
		
    	for (int i = 1; i <= n; i++) {
          out.println(cnt[i]);
        }
        out.close();
    }
  
}