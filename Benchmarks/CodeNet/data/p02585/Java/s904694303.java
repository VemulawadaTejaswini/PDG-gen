import java.io.*;
import java.util.*;

public class Main{
	static long maxSubstringSum(ArrayList<Integer>cycle,int maxSubLen) {
		int cycleLen=cycle.size();
		long ans=Integer.MIN_VALUE;
		long curSum=0;
		int  i=0,j=0;
		while(j<cycleLen) {
			if(j<i) {
				j++;
				continue;
			}
			if(curSum<0 || j-i==maxSubLen) {
				curSum-=cycle.get(i);
				i++;
				continue;
			}
			curSum+=cycle.get(j++);
			ans=Math.max(ans, curSum);
		}
		
		
		return ans;
	}
	static void main() throws Exception{
		int n=sc.nextInt(),k=sc.nextInt();
		int[]p=sc.intArr(n),c=sc.intArr(n);
		for(int i=0;i<n;i++)p[i]--;
		int[]inDeg=new int[n];
		for(int i=0;i<n;i++) {
			inDeg[p[i]]++;
		}
		LinkedList<Integer>l=new LinkedList<Integer>();
		for(int i=0;i<n;i++) {
			if(inDeg[i]==0) {
				l.add(i);
			}
		}
		long ans=Long.MIN_VALUE;
		boolean[]v=new boolean[n];
		while(!l.isEmpty()) {
			int i=l.poll();
			LinkedList<Integer>all=new LinkedList<Integer>();
			
			long sumCycle=0;
			int cur=i;
			while(!v[cur]) {
				v[cur]=true;
				sumCycle+=c[cur];
				all.add(cur);
				cur=p[cur];
			}
			LinkedList<Integer>nonCycle=new LinkedList<Integer>();
			while(all.peek()!=cur) {
				nonCycle.add(all.poll());
			}
			
			
			ArrayList<Integer>cycle=new ArrayList<Integer>();
			while(!all.isEmpty()) {
				cycle.add(c[all.poll()]);
			}
			int cycleLen=cycle.size();
			for(int j=0;j<cycleLen;j++) {
				cycle.add(cycle.get(j));
			}
			
			//no cycles
			ans=Math.max(ans, maxSubstringSum(cycle, Math.min(k, cycleLen)));
			
			//take cycles
			ans=Math.max(ans, sumCycle*(k/cycleLen)+maxSubstringSum(cycle, k%cycleLen));
			
			int suff=0;long sum=0;
			
			while(!nonCycle.isEmpty() && k>=suff) {
				suff++;
				sum+=nonCycle.pollLast();
				
				//no cycles
				ans=Math.max(ans, sum+maxSubstringSum(cycle, Math.min(k-suff, cycleLen)));
				
				//take cycles
				ans=Math.max(ans, sum+sumCycle*((k-suff)/cycleLen)+maxSubstringSum(cycle, (k-suff)%cycleLen));
			}
		}
		
		for(int i=0;i<n;i++) {
			if(v[i])continue;
LinkedList<Integer>all=new LinkedList<Integer>();
			
			long sumCycle=0;
			int cur=i;
			while(!v[cur]) {
				v[cur]=true;
				sumCycle+=c[cur];
				all.add(cur);
				cur=p[cur];
			}
			LinkedList<Integer>nonCycle=new LinkedList<Integer>();
			while(all.peek()!=cur) {
				nonCycle.add(all.poll());
			}
			
			
			ArrayList<Integer>cycle=new ArrayList<Integer>();
			while(!all.isEmpty()) {
				cycle.add(c[all.poll()]);
			}
			int cycleLen=cycle.size();
			for(int j=0;j<cycleLen;j++) {
				cycle.add(cycle.get(j));
			}
			
			//no cycles
			ans=Math.max(ans, maxSubstringSum(cycle, Math.min(k, cycleLen)));
			
			//take cycles
			ans=Math.max(ans, sumCycle*(k/cycleLen)+maxSubstringSum(cycle, k%cycleLen));
			
			int suff=0;long sum=0;
			
			while(!nonCycle.isEmpty() && k>=suff) {
				suff++;
				sum+=nonCycle.pollLast();
				
				//no cycles
				ans=Math.max(ans, sum+maxSubstringSum(cycle, Math.min(k-suff, cycleLen)));
				
				//take cycles
				ans=Math.max(ans, sum+sumCycle*((k-suff)/cycleLen)+maxSubstringSum(cycle, (k-suff)%cycleLen));
			}
		}
		
		pw.println(ans);
	}
	public static void main(String[] args) throws Exception{
		sc=new MScanner(System.in);
		pw = new PrintWriter(System.out);
		int tc=1;
//		tc=sc.nextInt();
		while(tc-->0)
			main();
		pw.flush();
	}
	static PrintWriter pw;
	static MScanner  sc;
	static class MScanner {
		StringTokenizer st;
		BufferedReader br;
		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int[] intArr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public long[] longArr(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public int[] intSortedArr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        shuffle(in);
	        Arrays.sort(in);
	        return in;
		}
		public long[] longSortedArr(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        shuffle(in);
	        Arrays.sort(in);
	        return in;
		}
		public Integer[] IntegerArr(int n) throws IOException {
	        Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public Long[] LongArr(int n) throws IOException {
	        Long[]in=new Long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public char nextChar() throws IOException {
			return next().charAt(0);
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
	static void shuffle(int[]in) {
		for(int i=0;i<in.length;i++) {
			int idx=(int)(Math.random()*in.length);
			int tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
	static void shuffle(long[]in) {
		for(int i=0;i<in.length;i++) {
			int idx=(int)(Math.random()*in.length);
			long tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
}