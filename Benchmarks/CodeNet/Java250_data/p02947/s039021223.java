import java.util.*;
import java.io.*;
public class Main{
	public static void main(String sp[])throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> al = new ArrayList<>();
		for(int i=0;i<n;i++){
			String temp = sc.next();
			char arr[] = temp.toCharArray();
			Arrays.sort(arr);
			String st = new String(arr);
			al.add(st);
		}
		Collections.sort(al);
		long count=0;
		long total=0;
		for(int i=0;i<n-1;i++){
			if(al.get(i).equals(al.get(i+1))){
				total++;
			}else{
				total+=1;
				count+=((total*(total-1))/2);
				total=0;
			}
		}
		total++;
		count+=((total*(total-1))/2);
		System.out.println(count);
		
	}
	
	
	static class Reader
		{
			final private int BUFFER_SIZE = 1 << 16;
			private DataInputStream din;
			private byte[] buffer;
			private int bufferPointer, bytesRead;
			BufferedReader br;
			public Reader()
			{
				din = new DataInputStream(System.in);
				buffer = new byte[BUFFER_SIZE];
				bufferPointer = bytesRead = 0;
				br = new BufferedReader(new InputStreamReader(System.in));
			}
	 
			public Reader(String file_name) throws IOException
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
				} while ((c = read()) >= '0' && c <= '9');
	 
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
				do
				{
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
	 
				do
				{
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
			StringTokenizer st;
			String next() {
				while (st == null || !st.hasMoreTokens()) {
					try {
						st = new StringTokenizer(br.readLine());
					} catch (Exception r) {
						r.printStackTrace();
					}
				}
				return st.nextToken();
			}
	 
	 
			public void close() throws IOException
			{
				if (din == null)
					return;
				din.close();
			}
		}
}