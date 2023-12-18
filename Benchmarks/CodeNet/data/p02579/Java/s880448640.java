import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;


public class Main {
	public static void main(String[] args) {
		
		for(int i=0;i<1;i++) {
			
			slover();
			out.flush();
		}
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
		//PriorityQueue<Integer> r=new PriorityQueue<Integer>();//add poll
	//Set<Long> a=new HashSet<Long>();
	//Integer.toBinaryString(i);
	//Integer.toString(i, 2);
//	//Integer.parseInt(bin, 2);
	//bitset
	
	private static int slover()   {
		int H=sc.nextInt();
		int W=sc.nextInt();
		int Cx=sc.nextInt()-1;
		int Cy=sc.nextInt()-1;
		int Dx=sc.nextInt()-1;
		int Dy=sc.nextInt()-1;
		boolean HW[][]=new boolean[H][W];
		
		for(int i=0;i<H;i++) {
			String S=sc.next();
			for(int t=0;t<W;t++) {
				if(S.charAt(t)=='#')HW[i][t]=false;
				else HW[i][t]=true;
			}
		}
		int hw[][]=new int[H][W];
		int count=0;
		int v1[]= {-1,0,0,1};
		int v2[]= {0,-1,1,0};
		for(int i=0;i<H;i++) {
			for(int t=0;t<W;t++) {
				if(HW[i][t]&&hw[i][t]==0) {
					count++;
					Queue<D> qq=new ArrayDeque<>();
					hw[i][t]=count;
					qq.add(new D(i,t));
					while(!qq.isEmpty()) {
						D cur=qq.poll();
						if(!HW[cur.x][cur.y])continue;
						
						hw[cur.x][cur.y]=count;
						for(int j=0;j<4;j++) {
							if(v1[j]+cur.x>=0&&v1[j]+cur.x<H&&v2[j]+cur.y>=0&&v2[j]+cur.y<W&&hw[v1[j]+cur.x][v2[j]+cur.y]==0) {
								qq.add(new D(v1[j]+cur.x,v2[j]+cur.y));
							}
						}
					}
					//System.out.println(Arrays.deepToString(hw));
					
				}
				
			}
		}
		Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		
		
		for(int i=1;i<=count;i++) {
			map.put(i, new ArrayList<Integer>(count));
		}
		
		
		
		/*for(int w=0;w<H;w++)for(int h=0;h<W;h++)
		{
			if(!HW[w][h])continue;
			for(int i=-2;i<=2;i++) {
				for(int t=-2;t<=2;t++) {
					if(i+t==0)continue;
					if(!(w+i>=0&&w+i<H&&h+t>=0&&h+t<W))continue;
					if(!HW[w+i][h+t])continue;
					if(hw[w+i][h+t]!=hw[w][h]&&!map.get(hw[w][h]).contains(hw[w+i][h+t]))
					{
						map.get(hw[w+i][h+t]).add(hw[w][h]);
						map.get(hw[w][h]).add(hw[w+i][h+t]);
						
					}
				}
			}
		}*/
		
	
		if(hw[Cx][Cy]==hw[Dx][Dy]){
			p(0);return 0;
		}
		boolean flag[]=new boolean[count+1];
		Arrays.fill(flag, false);
		Queue<D> qq=new ArrayDeque<>();
		qq.add(new D(hw[Cx][Cy],1));
		
		while(!qq.isEmpty()) {
			D c=qq.poll();
			
			for(int i:map.get(c.x)) {
				if(flag[i])continue;
				if(i==hw[Dx][Dy]) {
					p(c.y);
					return 0;
				}
				flag[i]=true;
				qq.add(new D(i,c.y+1));
			}
		}
		
		
		p(-1);
		
		
		
		
		
		
		
		
		
		
		
		return 0;
	}
private static class D{
		int x,y;
		D(int x,int y){
			this.x=x;;
			this.y=y;
			
		}
 
	}
	static void p(String ans) {out.println(ans);};
	static void p(int ans) {out.println(ans);};
	static void p() {out.println();};
	static void p(long ans) {out.println(ans);};
	static void p(double ans) {out.println(ans);};

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

