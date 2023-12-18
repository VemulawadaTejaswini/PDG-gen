import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		// Scanner sc = new Scanner(System.in);
		InputReader sc = new InputReader(System.in);
		// Scanner sc = new Scanner(new File("in1.txt"));
		// Scanner sc = new Scanner(new File("in2.txt"));
		int N = sc.nextInt();
		
		int r0 = sc.nextInt();
		int r1 = sc.nextInt();
		int max_profit = r1 - r0;
		int min_r = Math.min(r0, r1);
// 		while (sc.hasNextInt()) {
		for (int i = 0; i < N; i++) {
			int r = sc.nextInt();
			max_profit = Math.max(max_profit, r - min_r);
			min_r = Math.min(min_r, r);
		}
		System.out.println(max_profit);
	}
	
	//???????????????????????¬
	  static class InputReader {
	      private InputStream stream;
	      private byte[] buf = new byte[1024];
	      private int curChar;
	      private int numChars;
	      private SpaceCharFilter filter;
	 
	      public InputReader(InputStream stream) {
	          this.stream = stream;
	      }
	  
	      public int next() {
	          if (numChars == -1)
	              throw new InputMismatchException();
	          if (curChar >= numChars) {
	              curChar = 0;
	              try {
	                  numChars = stream.read(buf);
	              } catch (IOException e) {
	                  throw new InputMismatchException();
	              }
	              if (numChars <= 0)
	                  return -1;
	          }
	          return buf[curChar++];
	      }
	  
	      public String nextStr() {
	        int c = next();
	        while(isSpaceChar(c)){c = next();}
	        StringBuffer str = new StringBuffer();
	        do{
	          str.append((char)c);
	          c = next();
	        }while(!isSpaceChar(c));
	        return str.toString();
	      }
	 
	      public int nextInt() {
	          int c = next();
	          while (isSpaceChar(c))
	              c = next();
	          int sgn = 1;
	          if (c == '-') {
	              sgn = -1;
	              c = next();
	          }
	          int res = 0;
	          do {
	              if (c < '0' || c > '9')
	                  throw new InputMismatchException();
	              res *= 10;
	              res += c - '0';
	              c = next();
	          } while (!isSpaceChar(c));
	          return res * sgn;
	      }
	  
	      public boolean isSpaceChar(int c) {
	          if (filter != null)
	              return filter.isSpaceChar(c);
	          return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	      }
	  
	      public interface SpaceCharFilter {
	          public boolean isSpaceChar(int ch);
	      }
	  }	
}