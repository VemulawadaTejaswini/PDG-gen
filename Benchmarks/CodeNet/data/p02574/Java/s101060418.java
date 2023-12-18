import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	static long mod = (long)(1e9+7);
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	public static void main(String[] args)throws IOException {
		//Scanner sc =new Scanner(System.in);
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int arr[] = new int[n+1];
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=1;i<=n;i++){
			arr[i] = sc.nextInt();
			if(!hm.containsKey(arr[i]))
				hm.put(arr[i],1);
			else hm.put(arr[i],hm.get(arr[i])+1);
		}
		boolean g = true;
		ArrayList<Integer> l = new ArrayList<>(hm.keySet());
		for(int o : l){
			if(o==1){
				continue;
			}
			if(hm.get(o)>1){
				g =  false;
				break;
			}
		}
		boolean check1 = (g && check1(arr, n));
		if(check1==true){
			System.out.println("pairwise coprime");
			return;
		}
		int gcd = arr[1];
		for(int i=2;i<=n;i++){
			gcd = gcd(arr[i],gcd);
		}
		if(gcd==1){
			System.out.println("setwise coprime");
			return;
		}
		System.out.println("not coprime");
		
	}
	
	public static boolean check1(int arr[], int n){
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=1;i<=n;i++)
			hm.put(arr[i],0);
		int op[] = new int[(int)1e6+1];
		boolean ver[] = new boolean[(int)1e6+1];
		int u = (int)1e6;
		for(int i=2;i<=Math.sqrt(u);i++){
			if(ver[i]==false){
				for(int j=2*i;j<=u;j+=i){
				
					if(hm.containsKey(j))
						op[i]++;
					ver[j]=true;
				}
			}
		}
		for(int i=1;i<=n;i++){
			if(op[i]>1)
				return false;
		}
		return true;
	}
	
	
	public static LinkedList<Integer> comp(LinkedList<Integer> q){
		LinkedList<Integer> op = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		while(q.size()>0){
			stack.push(q.pop());
		}
		while(stack.size()>0){
			op.addLast(stack.pop());
		}
		return op;
	}
	
	public static ArrayList<Integer> primefactor(int n){
		int sqrt = (int)Math.sqrt(n);
		ArrayList<Integer> al = new ArrayList<>();
		while(n%2==0){
			al.add(2);
			n/=2;
		}
		for(int i=3;i<=sqrt;i+=2){
			while(n%i==0){
				al.add(i);
				n/=i;
			}
		}
		if(n>2)
			al.add(n);
		return al;
	}
	
	public static long sum(long val){
		long fg =0 ;
		while(val!=0){
			fg+=val%10;
			val/=10;
		}
		return fg;
	}
	
	
	
	public static ArrayList<Long> factor(long n){
		long sqrt = (long)Math.sqrt(n);
		ArrayList<Long> al = new ArrayList<>();
		for(long i=1;i<=sqrt;i++){
			if(n%i!=0)
				continue;
			long first = i;
			long second = n/i;
			al.add(i);
			if(first==second){
				continue;
			}
			al.add(n/i);
		}
		return al;
	}
	
	
	
	public static ArrayList<Integer> comp(){
		ArrayList<Integer> al = new ArrayList<>();
			int n = (int)2e5;
			boolean arr[] = new boolean[n+1];
			int sqrt = (int)Math.sqrt(n);
			for(int i=2;i<=sqrt;i++){
				if(arr[i]==false){
					for(int j=i*i;j<=n;j+=i){
						arr[j]=true;
					}
				}
			}
			for(int i=2;i<=n;i++){
				if(arr[i]==false)
					al.add(i);
			}
			
		return al;
	}
	
	public static class pair{
		int x;
		int y;
		pair(int x, int y){
			this.x=x;
			this.y=y;
		}
	}
	
	public static class comp implements Comparator<pair>{
		public int compare(pair o1, pair o2){
			return o2.y-o1.y;
		}
	}
	
	
	
	static class Node{
		int node;
		int d;
		ArrayList<Integer> al = new ArrayList<>();	
	}
	

	static int gcd(int a, int b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    }
	
		
	static class FastReader 
	{ 
		final private int BUFFER_SIZE = 1 << 16; 
		private DataInputStream din; 
		private byte[] buffer; 
		private int bufferPointer, bytesRead; 
  
		public FastReader() 
		{ 
			din = new DataInputStream(System.in); 
			buffer = new byte[BUFFER_SIZE]; 
			bufferPointer = bytesRead = 0; 
		} 
  
		public FastReader(String file_name) throws IOException 
		{ 
			din = new DataInputStream(new FileInputStream(file_name)); 
			buffer = new byte[BUFFER_SIZE]; 
			bufferPointer = bytesRead = 0; 
		} 
  
		public String readLine() throws IOException 
		{ 
			byte[] buf = new byte[64]; // line length 
			int cnt = 0, c; 
			while ((c = read()) != -1) 
			{ 
				if (c == '\n') 
					break; 
				buf[cnt++] = (byte) c; 
			} 
			return new String(buf, 0, cnt); 
		} 
  
		public int nextInt() throws IOException 
		{ 
			int ret = 0; 
			byte c = read(); 
			while (c <= ' ') 
				c = read(); 
			boolean neg = (c == '-'); 
			if (neg) 
				c = read(); 
			do
			{ 
				ret = ret * 10 + c - '0'; 
			}  while ((c = read()) >= '0' && c <= '9'); 
  
			if (neg) 
				return -ret; 
			return ret; 
		} 
  
		public long nextLong() throws IOException 
		{ 
			long ret = 0; 
			byte c = read(); 
			while (c <= ' ') 
				c = read(); 
			boolean neg = (c == '-'); 
			if (neg) 
				c = read(); 
			do { 
				ret = ret * 10 + c - '0'; 
			} 
			while ((c = read()) >= '0' && c <= '9'); 
			if (neg) 
				return -ret; 
			return ret; 
		} 
  
		public double nextDouble() throws IOException 
		{ 
			double ret = 0, div = 1; 
			byte c = read(); 
			while (c <= ' ') 
				c = read(); 
			boolean neg = (c == '-'); 
			if (neg) 
				c = read(); 
  
			do { 
				ret = ret * 10 + c - '0'; 
			} 
			while ((c = read()) >= '0' && c <= '9'); 
  
			if (c == '.') 
			{ 
				while ((c = read()) >= '0' && c <= '9') 
				{ 
					ret += (c - '0') / (div *= 10); 
				} 
			} 
  
			if (neg) 
				return -ret; 
			return ret; 
		} 
		
		
  
		private void fillBuffer() throws IOException 
		{ 
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
			if (bytesRead == -1) 
				buffer[0] = -1; 
		} 
  
		private byte read() throws IOException 
		{ 
			if (bufferPointer == bytesRead) 
				fillBuffer(); 
			return buffer[bufferPointer++]; 
		} 
  
		public void close() throws IOException 
		{ 
			if (din == null) 
				return; 
			din.close(); 
		} 
	} 
}