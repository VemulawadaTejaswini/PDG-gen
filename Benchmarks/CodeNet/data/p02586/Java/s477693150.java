

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;

public class Main {
    static Scan sc = new Scan();
    static Print p = new Print();
    static int R, C, K;
    static int[][] arr;
    static int dp_solve(int r, int j, int m) {
    // System.out.println("r:"+r+" j:"+j+" m:"+m);
      if(r >= R || j >= C)return 0; 
      if(r == R - 1 && j == C - 1)return arr[r][j];
      if(m > 3)return 0; 
      int sol1 = 0, sol2 = 0;
      sol1 = arr[r][j] + dp_solve(r, j + 1, m + 1);
      sol2 = arr[r][j] + dp_solve(r + 1, j, 1);
      //System.out.println(sol1+" "+sol2+" "+arr[r][j]); 
      return Integer.max(sol1, sol2);
    }
	public static void main(String[] args) throws Exception{
    R = sc.scanInt();
    C = sc.scanInt();
    K = sc.scanInt();

    arr = new int[K][K]; 
    
    for(int i = 0; i < K; i++)arr[sc.scanInt() - 1][sc.scanInt() - 1] = sc.scanInt();
       
   p.printLine(Integer.toString(dp_solve(0, 0, 1)));
    
   p.close();
	}
	static class Scan
	{
		private byte[] buf=new byte[1024];
		private int index;
		private InputStream in;
		private int total;
		public Scan()
		{
			in=System.in;
		}
		public int scan()throws IOException
		{
			if(total<0)
			throw new InputMismatchException();
			if(index>=total)
			{
				index=0;
				total=in.read(buf);
				if(total<=0)
				return -1;
			}
			return buf[index++];
		}
		public int scanInt()throws IOException
		{
			int integer=0;
			int n=scan();
			while(isWhiteSpace(n))
			n=scan();
			int neg=1;
			if(n=='-')
			{
				neg=-1;
				n=scan();
			}
			while(!isWhiteSpace(n))
			{
				if(n>='0'&&n<='9')
				{
					integer*=10;
					integer+=n-'0';
					n=scan();
				}
				else throw new InputMismatchException();
			}
			return neg*integer;
		}
		public double scanDouble()throws IOException
		{
			double doub=0;
			int n=scan();
			while(isWhiteSpace(n))
			n=scan();
			int neg=1;
			if(n=='-')
			{
				neg=-1;
				n=scan();
			}
			while(!isWhiteSpace(n)&&n!='.')
			
			{
				if(n>='0'&&n<='9')
				{
					doub*=10;
					doub+=n-'0';
					n=scan();
				}
				else throw new InputMismatchException();
			}
			if(n=='.')
			{
				n=scan();
				double temp=1;
				while(!isWhiteSpace(n))
				{
					if(n>='0'&&n<='9')
					{
						temp/=10;
						doub+=(n-'0')*temp;
						n=scan();
					}
					else throw new InputMismatchException();
				}
			}
			return doub*neg;
		}
		public String scanString()throws IOException
		{
			StringBuilder sb=new StringBuilder();
			int n=scan();
			while(isWhiteSpace(n))
			n=scan();
			while(!isWhiteSpace(n))
			{
				sb.append((char)n);
				n=scan();
			}
			return sb.toString();
		}
		private boolean isWhiteSpace(int n)
		{
			if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)
			return true;
			return false;
		}
	}
	static class Print
	{
		private final BufferedWriter bw;
		public Print()
		{
			bw=new BufferedWriter(new OutputStreamWriter(System.out));
		}
		public void print(String str)throws IOException
		{
			bw.append(str);
		}
		public void printLine(String str)throws IOException
		{
			print(str);
			bw.append("\n");
		}
		public void close()throws IOException
		{
			bw.close();
		}
	}   


}
