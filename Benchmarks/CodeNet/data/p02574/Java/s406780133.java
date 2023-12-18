import java.util.*;
import java.io.*;

public class Main
{
    static class Reader {
		BufferedReader br;
		StringTokenizer st;
 
		public Reader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
 
	}
    static class Ele implements Comparable<Ele> 
    {  
        public int x,y;  
        Ele(int x,int y) 
        {  
            this.x=x;this.y=y; 
        }  
        public int compareTo(Ele ob) {  
        if(ob.x!=x)return x-ob.x;
        return this.y-ob.y;  
        }   
    }
    int a[][];int b[][];
    
    int gcd(int a,int b)
    {
        int min=Math.min(a,b);
        int max=Math.max(a,b);
        while (max%min!=0)
        {
            a=max%min;
            max=min;min=a;
        }
        return min;
    }
	public static void main(String[] args) throws IOException 
	{
		Reader sc=new Reader();Main G=new Main();
		PrintWriter o = new PrintWriter(System.out);
		//int t=1;
		int t=sc.nextInt();
		
		int n,m,y,x,y1,x1,x2,y2,s0,s2;int a[],b[],in[],in1[];
		long k,s,l;boolean b1[],b2;String s1[],ss;int mod=(int)1e9+7;
		//long l;long a[]; 
		ArrayList<ArrayList<Integer>> ll=new ArrayList<>();
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		ArrayList<Integer> a3=new ArrayList<>();
		ArrayDeque<Integer> deq=new ArrayDeque<>();
		TreeSet<Integer> h0=new TreeSet<>();
		TreeSet<Integer> h1=new TreeSet<>();
		HashMap<Integer,Integer> h=new HashMap<>();
		try{
		while (t-->0)
		{
		    n=sc.nextInt();a=new int[(int)1e6+3];m=-1;
		    b=new int[(int)1e6+3];
		    for (int i=0;i<n;i++)
		    {
		        x=sc.nextInt();
		        if (m==-1)m=x;
		        else m=G.gcd(m,x);
		        a[x]++;
		    }
		    
		    for (int i=2;i*i<=b.length;i++)
		    {
		        if (b[i]==0)
		        for (int j=2*i;j<b.length;j+=i)
		        {
		            b[i]=1;
		            a[i]+=a[j];
		        }
		    }
		    
		    //o.println(m);
		    //o.println(Arrays.toString(a));
		    
		    if (m==1)
		    {
		        for (int i=2;i<a.length;i++)
		        if (a[i]>1)m=a[i];
		        if (m!=1) o.println("setwise coprime");
		        else o.println("pairwise coprime");
		    }
		    else 
		    {
		        o.println("not coprime");
		    }
		    
		    //o.println(h);
		    //o.println(x2);
		    //o.println();
		    h0.clear();ll.clear();a1.clear();a2.clear();h1.clear();
		}
		}
		catch (Throwable e)
		{
		    e.printStackTrace();
		}
		//o.println("HI");
		
        o.flush();
        o.close();
	}
} 