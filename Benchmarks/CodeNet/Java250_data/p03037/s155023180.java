import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;


public class Main {
	public static void main(String[] args) {


		slover();
		out.flush();
	}
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	//StringBuffer S = new StringBuffer(sc.next());
	//String hoge2 = str.reverse().toString();
	//map.containsKey(A)
	//Map<Integer, Integer> map = new HashMap<Integer, Integer>(N);
	/*for ( キーのデータ型 key : マップの名前.keySet() ) {
		データのデータ型 data = マップの名前.get( key );

		// keyやdataを使った処理;
	}*/
	//int i = Integer.parseInt(s);
	//Queue<String> qq=new ArrayDeque<>(); //add,poll,peek BFSは前から実行される
	//Deque<String> dd=new ArrayDeque<>();//push後ろに入れる,poll(pop)後ろからとる,peek addは先頭に入るからバグ注意
	//stackdfsは後ろから実行される
	//ArrayList<Integer> cc = new ArrayList<>(N);
	//cc.contains(tmp)
	//Arrays.asList(c).contains("a")
	//list.set(1,"walk");//1 1 2 3 5





	private static int slover() {


		int N=sc.nextInt();
		int M=sc.nextInt();
		
		int L[]=new int[M];
		int R[]=new int[M];
		int l=0;
		int r=1000000007;
		for(int i=0;i<M;i++) {
			l=Math.max(l, sc.nextInt());
			r=Math.min(r, sc.nextInt());
		}

		p(r-l+1>=0 ?r-l+1:0);



		return 0;
	}






	static long Nsin(long t) {
		long sum=0;
		long v=1;
		long tt=1;
		for(long k=0;k<(t+"").length();k++) {
			sum+=(t%(tt*10)-t%tt)/tt*v;
			v*=t;
			tt*=10;
		}
		return sum;
	}

	static long so(long n) {
		for(long i=2;i*i<=n;i++) {
			if(n%i==0) {
				return i;
			}
		}
		return 0;

	}



	     static void nibun(int a,int b,int target) {

	    	 int ok=a;
	    	 int ng=b;


	    	 int t=2;

	    	 while(a<b) {
	    		 int G=(ok+ng)/2;
	    		 if(t==target) {
	    			 break;
	    		 }
	    		 if(t>ok) {

	    		 }
	    		 if(t>ng) {

	    		 }



	    	 }



	     }





		//StringBuffer str = new StringBuffer(sc.nextInt());
		//for(int i=0;i<N;i++) {}




			//	p("===================");
				//for(int f:gyo.keySet()){
				    //p(gyo.get(f));
			//	}
			//	p("===================");














	static void p(String ans) {out.println(ans);};
	static void p(int ans) {out.println(ans);};
	static void p() {out.println();};
	static void p(long ans) {out.println(ans);};
	static void p(double ans) {out.println(ans);};

	static void pn(String ans) {out.print(ans);};
	static void pn(int ans) {out.print(ans);};
	static void pn() {out.print("");};
	static void pn(long ans) {out.print(ans);};
	static void pn(double ans) {out.print(ans);};

	static class FastScanner {
	    private final InputStream in = System.in;
	    private final byte[] buffer = new byte[1024];
	    private int ptr = 0;
	    private int buflen = 0;

	    private boolean hasNextByte() {
	      if (ptr < buflen) {
	        return true;
	      } else {
	        ptr = 0;
	        try {
	          buflen = in.read(buffer);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }
	        if (buflen <= 0) {
	          return false;
	        }
	      }
	      return true;
	    }

	    private int readByte() {
	      if (hasNextByte()) return buffer[ptr++];
	      else return -1;
	    }

	    private static boolean isPrintableChar(int c) {
	      return 33 <= c && c <= 126;
	    }

	    private void skipUnprintable() {
	      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
	    }

	    public boolean hasNext() {
	      skipUnprintable();
	      return hasNextByte();
	    }

	    public String next() {
	      if (!hasNext()) throw new NoSuchElementException();
	      StringBuilder sb = new StringBuilder();
	      int b = readByte();
	      while (isPrintableChar(b)) {
	        sb.appendCodePoint(b);
	        b = readByte();
	      }
	      return sb.toString();
	    }

	    public long nextLong() {
	      if (!hasNext()) throw new NoSuchElementException();
	      long n = 0;
	      boolean minus = false;
	      int b = readByte();
	      if (b == '-') {
	        minus = true;
	        b = readByte();
	      }
	      if (b < '0' || '9' < b) {
	        throw new NumberFormatException();
	      }
	      while (true) {
	        if ('0' <= b && b <= '9') {
	          n *= 10;
	          n += b - '0';
	        } else if (b == -1 || !isPrintableChar(b)) {
	          return minus ? -n : n;
	        } else {
	          throw new NumberFormatException();
	        }
	        b = readByte();
	      }
	    }

	    public int nextInt() {
	      return (int) nextLong();
	    }

	    public double nextDouble(){
	    	return Double.parseDouble(next());
	    }

	    public int[] nextIntArray(int N, boolean oneBased) {
	      if (oneBased) {
	        int[] array = new int[N + 1];
	        for (int i = 1; i <= N; i++) {
	          array[i] = sc.nextInt();
	        }
	        return array;
	      } else {
	        int[] array = new int[N];
	        for (int i = 0; i < N; i++) {
	          array[i] = sc.nextInt();
	        }
	        return array;
	      }
	    }

	    public long[] nextLongArray(int N, boolean oneBased) {
	      if (oneBased) {
	        long[] array = new long[N + 1];
	        for (int i = 1; i <= N; i++) {
	          array[i] = sc.nextLong();
	        }
	        return array;
	      } else {
	        long[] array = new long[N];
	        for (int i = 0; i < N; i++) {
	          array[i] = sc.nextLong();
	        }
	        return array;
	      }
	    }
	  }
}

