import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


/*


2*3^n precomp for cost of each mask/person pair

n - brute force number of railroads
2^n - who walks horizontally
n - nHorizontal points

n*n^3 * 2^n *2

 */
public class Main {
	static PrintWriter out = new PrintWriter(System.out);
	public Main() throws InterruptedException {
		FastScanner fs=new FastScanner();
		int n=fs.nextInt();
		Town[] towns=new Town[n];
		for (int i=0; i<n; i++) {
			towns[i]=new Town(fs.nextInt(), fs.nextInt(), fs.nextInt());
		}
		long time=System.currentTimeMillis();
		int[] bitcount=new int[1<<n];
		for (int i=0; i<1<<n; i++) bitcount[i]=Integer.bitCount(i);
		
		//lineHCost[i][mask] = min cost to cover mask, placing i lines
		long[][] linesHCost=new long[n+1][1<<n];
		for (int i=0; i<n; i++)
			for (int j=0; j<1<<n; j++)
				linesHCost[i][j]=i<bitcount[j]?Integer.MAX_VALUE:0;
		for (int mask=0; mask<1<<n; mask++) {
			int nUsed=bitcount[mask];
			Town[] usedTowns=new Town[nUsed];
			nUsed=0;
			for (int i=0; i<n; i++) if ((mask&(1<<i))!=0) usedTowns[nUsed++]=towns[i];
			Arrays.sort(usedTowns, (a, b) -> {
				return Integer.compare(a.y, b.y);
			});
			
			for (int inner=0; inner<1<<nUsed; inner++) {
				int placed=bitcount[inner];//plus 0
				for (int i=0; i<nUsed; i++) {
					usedTowns[i].cost=usedTowns[i].ay;
				}
				int lastY=-(int)1e8;
				for (int i=0; i<nUsed; i++) {
					if ((inner & (1<<i))!=0) lastY=usedTowns[i].y;
					usedTowns[i].cost=min(usedTowns[i].cost, usedTowns[i].y-lastY);
				}
				lastY=(int)1e8;
				for (int i=nUsed-1; i>=0; i--) {
					if ((inner & (1<<i))!=0) lastY=usedTowns[i].y;
					usedTowns[i].cost=min(usedTowns[i].cost, lastY-usedTowns[i].y);
				}
				
				long total=0;
				for (Town t:usedTowns) {
					total+=t.cost*(long)t.weight;
				}
				linesHCost[placed][mask]=min(linesHCost[placed][mask], total);
			}
		}
		
		
		long[][] linesVCost=new long[n+1][1<<n];
		for (int i=0; i<n; i++)
			for (int j=0; j<1<<n; j++)
				linesVCost[i][j]=i<bitcount[j]?Integer.MAX_VALUE:0;
		for (int mask=0; mask<1<<n; mask++) {
			int nUsed=bitcount[mask];
			Town[] usedTowns=new Town[nUsed];
			nUsed=0;
			for (int i=0; i<n; i++) if ((mask&(1<<i))!=0) usedTowns[nUsed++]=towns[i];
			Arrays.sort(usedTowns, (a, b) -> {
				return Integer.compare(a.x, b.x);
			});
			
			for (int inner=0; inner<1<<nUsed; inner++) {
				int placed=bitcount[inner];//plus 0
				for (int i=0; i<nUsed; i++) {
					usedTowns[i].cost=usedTowns[i].ax;
				}
				int lastX=-(int)1e8;
				for (int i=0; i<nUsed; i++) {
					if ((inner & (1<<i))!=0) lastX=usedTowns[i].x;
					usedTowns[i].cost=min(usedTowns[i].cost, usedTowns[i].x-lastX);
				}
				lastX=(int)1e8;
				for (int i=nUsed-1; i>=0; i--) {
					if ((inner & (1<<i))!=0) lastX=usedTowns[i].x;
					usedTowns[i].cost=min(usedTowns[i].cost, lastX-usedTowns[i].x);
				}
				
				long total=0;
				for (Town t:usedTowns) {
					total+=t.cost*(long)t.weight;
				}
				linesVCost[placed][mask]=min(linesVCost[placed][mask], total);
			}
		}
//		System.out.println("Finished precomp");
		//System.err.println(System.currentTimeMillis()-time);
		
		for (int linesToPlace=0; linesToPlace<=n; linesToPlace++) {
			long minCost=Long.MAX_VALUE;
			for (int hMask=0; hMask<1<<n; hMask++) {
				for (int hLines=0; hLines<=linesToPlace; hLines++) {
					int vLines=linesToPlace-hLines;
					int fullMask=(1<<n)-1;
					int vMask=fullMask^hMask;
					long curCost=linesVCost[vLines][vMask] + linesHCost[hLines][hMask];
					
					minCost=min(minCost, curCost);
				}
			}
			out.println(minCost);
		}
		//System.err.println(System.currentTimeMillis()-time);
      out.close();
	}
	
	int min(int a, int b) {
		return a<b?a:b;
	}
	
	long min(long a, long b) {
		return a<b?a:b;
	}
	
	static class Town {
		int x, y, weight, cost;
		int ax, ay;
		boolean used;
		public Town(int x, int y, int weight) {
			this.x=x;
			this.y=y;
			this.ax=Math.abs(x);
			this.ay=Math.abs(y);
			this.weight=weight;
		}
	}
	
	void sort(int[] a) {
		ArrayList<Integer> list=new ArrayList<>();
		for (int i:a) list.add(i);
		Collections.sort(list);
		for (int i=0; i<a.length; i++) a[i]=list.get(i);
	}
	
	public static void main(String[] args) throws InterruptedException {
		new Main();
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		public String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
			
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
		
		public long[] readLongArray(int n) {
			long[] a=new long[n];
			for (int i=0; i<n; i++) a[i]=nextLong();
			return a;
		}
	}

}
