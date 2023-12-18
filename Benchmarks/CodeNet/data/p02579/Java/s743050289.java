import java.io.*;import java.util.*;import java.math.*;
public class Main
{
	static long mod=1000000007l;
    static int max=Integer.MAX_VALUE,min=Integer.MIN_VALUE;
    static long maxl=Long.MAX_VALUE,minl=Long.MIN_VALUE;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb;
    
    static public void main(String[] args)throws Exception
    {
    	st=new StringTokenizer(br.readLine());
    	int n=i();
    	int m=i();
    	int a=i()-1;
    	int b=i()-1;
    	int c=i()-1;
    	int d=i()-1;
    	char ch[][]=arc(n,m);
    	boolean bo[][]=new boolean[n][m];
    	int ar[][]=new int[n][m];
    	//bo[a][b]=true;
    	int i=0;
    	int s=0;
    	int dd=0;
    	for(int xx=0;xx<n;xx++)
    	{
    		for(int yy=0;yy<m;yy++)
    		{
    			if(!bo[xx][yy]&&ch[xx][yy]=='.')
    			{
    				i++;
	    			LinkedList<Integer> l=new LinkedList<>();
	    			l.add(xx*m+yy);
	    			bo[xx][yy]=true;
	    			ar[xx][yy]=i;
	    			
	    			while(l.size()>0)
	    			{
	    				int v=l.remove();
	    				int x=v/m;
	    				int y=v%m;
	    				if(x==a&&y==b)s=i;
		    			if(x==c&&y==d)dd=i;
		        		if(x!=0&&ch[x-1][y]=='.'&&!bo[x-1][y])
		        		{
		        			ar[x-1][y]=i;
		        			l.add(v-m);
		        			bo[x-1][y]=true;
		        		}
		        		if(x!=n-1&&ch[x+1][y]=='.'&&!bo[x+1][y])
		        		{
		        			ar[x+1][y]=i;
		        			l.add(v+m);
		        			bo[x+1][y]=true;
		        		}
		        		if(y!=0&&ch[x][y-1]=='.'&&!bo[x][y-1])
		        		{
		        			ar[x][y-1]=i;
		        			l.add(v-1);
		        			bo[x][y-1]=true;
		        		}
		        		if(y!=m-1&&ch[x][y+1]=='.'&&!bo[x][y+1])
		        		{
		        			ar[x][y+1]=i;
		        			l.add(v+1);
		        			bo[x][y+1]=true;
		        		}
	    			}
	    			
	    	    		
    			}
    		}
    	}
    	
    	//p(s+" "+dd);
    	//pl(bo[0][3]);
    	if(dd==s)
    	{
    		pl(0);
    		return ;
    	}
    	int cc=0;
    	HashSet<Integer> al[]=new HashSet[i+1];
    	for(int x=0;x<=i;x++)al[x]=new HashSet<>();
    	
    	for(int x=0;x<n;x++)
    	{
    		for(int y=0;y<m;y++)
    		{
    			if(ar[x][y]!=0)
    			{
	    			int ll=max(0,x-2);
	    			int rr=min(x+2,n-1);
	    			int lll=max(0,y-2);
	    			int rrr=min(y+2,m-1);
	    			int v=ar[x][y];
	    			for(int aa=ll;aa<=rr;aa++)
	    			{
	    				for(int bb=lll;bb<=rrr;bb++)
	    				{
	    		    		if(ar[aa][bb]!=v)al[v].add(ar[aa][bb]);
	    				}
	    			}
    			}
    		}
    	}
    	LinkedList<Integer> l=new LinkedList<>();
    	l.add(s);
    	
    	boolean q[]=new boolean[i+1];
    	q[s]=true;
    	//for(int e:al[s])q[e]=true;
    	int vv=0;
    	while(l.size()>0)
    	{
    		vv++;
    		int ss=l.size();
    		while(ss-->0)
    		{
    			int e=l.remove();
    			for(int ee:al[e])
    			{
    				if(!q[ee])
    				{
    					q[ee]=true;
    					l.add(ee);
    					if(ee==dd)
    					{
    						pl(vv);
    						return;
    					}
    				}
    			}
    		}
    	}
    	pl(-1);
    }
    
    static void s(String s){sb.append(s);}
    static void s(int s){sb.append(s);}
    static void s(long s){sb.append(s);}
    static void s(char s){sb.append(s);}
    static void s(double s){sb.append(s);}
    static void ss(){sb.append(' ');}
    static void sl(String s){sb.append(s);sb.append("\n");}
    static void sl(int s){sb.append(s);sb.append("\n");}
    static void sl(long s){sb.append(s);sb.append("\n");}
    static void sl(char s){sb.append(s);sb.append("\n");}
    static void sl(double s){sb.append(s);sb.append("\n");}
    static void sl(){sb.append("\n");}
    static int max(int a,int b){return a>b?a:b;}
    static int min(int a,int b){return a<b?a:b;}
    static int abs(int a){return Math.abs(a);}
    static long max(long a,long b){return a>b?a:b;}
    static long min(long a,long b){return a<b?a:b;}
    static long abs(long a){return Math.abs(a);}
    static int sq(int a){return (int)Math.sqrt(a);}
    static long sq(long a){return (long)Math.sqrt(a);}
    static int gcd(int a,int b){return b==0?a:gcd(b,a%b);}
    static boolean pa(String s,int i,int j)
    {
    	while(i<j)if(s.charAt(i++)!=s.charAt(j--))return false;
    	return true;
    }
    static int ncr(int n,int c,long m)
    {
        long a=1l;
        for(int x=n-c+1;x<=n;x++)a=((a*x)%m);
        long b=1l;
        for(int x=2;x<=c;x++)b=((b*x)%m);
        return (int)((a*(mul((int)b,m-2,m)%m))%m);
    }
    static boolean[] sieve(int n)
    {
        boolean bo[]=new boolean[n+1];
        bo[0]=true;bo[1]=true;
        for(int x=4;x<=n;x+=2)bo[x]=true;
        for(int x=3;x*x<=n;x+=2)if(!bo[x])for(int y=x*x;y<=n;y+=x)bo[y]=true;
        return bo;
    }
    static int[] fac(int n)
    {
        int bo[]=new int[n+1];
        for(int x=1;x<=n;x++)for(int y=x;y<=n;y+=x)bo[y]++;
        return bo;
    }
    static long mul(long a,long b,long m) 
    {
        long r=1l;
        a%=m;  
        while(b>0)
        {
            if((b&1)==1)r=(r*a)%m; 
            b>>=1;
            a=(a*a)%m;  
        } 
        return r; 
    }
    static int i()throws IOException
    {
        if(!st.hasMoreTokens())st=new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }
    static long l()throws IOException
    {
        if(!st.hasMoreTokens())st=new StringTokenizer(br.readLine());
        return Long.parseLong(st.nextToken());
    }
    static String s()throws IOException
    {
        if(!st.hasMoreTokens())st=new StringTokenizer(br.readLine());
        return st.nextToken();
    }
    static double d()throws IOException
    {
        if(!st.hasMoreTokens())st=new StringTokenizer(br.readLine());
        return Double.parseDouble(st.nextToken());
    }
    static void p(Object p){System.out.print(p);}
    static void p(String p){System.out.print(p);}
    static void p(int p){System.out.print(p);}
    static void p(double p){System.out.print(p);}
    static void p(long p){System.out.print(p);}
    static void p(char p){System.out.print(p);}
    static void p(boolean p){System.out.print(p);}
    static void pl(Object p){System.out.println(p);}
    static void pl(String p){System.out.println(p);}
    static void pl(int p){System.out.println(p);}
    static void pl(char p){System.out.println(p);}
    static void pl(double p){System.out.println(p);}
    static void pl(long p){System.out.println(p);}
    static void pl(boolean p){System.out.println(p);}
    static void pl(){System.out.println();}
    static int[] ari(int n)throws IOException
    {
        int ar[]=new int[n];
        if(!st.hasMoreTokens())st=new StringTokenizer(br.readLine());
        for(int x=0;x<n;x++)ar[x]=Integer.parseInt(st.nextToken());
        return ar;
    }
    static int[][] ari(int n,int m)throws IOException
    {
        int ar[][]=new int[n][m];
        for(int x=0;x<n;x++)
        {
        	if(!st.hasMoreTokens())st=new StringTokenizer(br.readLine());
            for(int y=0;y<m;y++)ar[x][y]=Integer.parseInt(st.nextToken());
        }
        return ar;
    }
    static long[] arl(int n)throws IOException
    {
        long ar[]=new long[n];
        if(!st.hasMoreTokens())st=new StringTokenizer(br.readLine());
        for(int x=0;x<n;x++) ar[x]=Long.parseLong(st.nextToken());
        return ar;
    }
    static long[][] arl(int n,int m)throws IOException
    {
        long ar[][]=new long[n][m];
        for(int x=0;x<n;x++)
        {
        	if(!st.hasMoreTokens())st=new StringTokenizer(br.readLine());
            for(int y=0;y<m;y++)ar[x][y]=Long.parseLong(st.nextToken());
        }
        return ar;
    }
    static String[] ars(int n)throws IOException
    {
        String ar[]=new String[n];
        if(!st.hasMoreTokens())st=new StringTokenizer(br.readLine());
        for(int x=0;x<n;x++) ar[x]=st.nextToken();
        return ar;
    }
    static double[] ard(int n)throws IOException
    {
        double ar[]=new double[n];
        if(!st.hasMoreTokens())st=new StringTokenizer(br.readLine());
        for(int x=0;x<n;x++)ar[x]=Double.parseDouble(st.nextToken());
        return ar;
    }
    static double[][] ard(int n,int m)throws IOException
    {
        double ar[][]=new double[n][m];
        for(int x=0;x<n;x++)
        {
        	if(!st.hasMoreTokens())st=new StringTokenizer(br.readLine());
            for(int y=0;y<m;y++)ar[x][y]=Double.parseDouble(st.nextToken());
        }
        return ar;
    }
    static char[] arc(int n)throws IOException
    {
        char ar[]=new char[n];
        if(!st.hasMoreTokens())st=new StringTokenizer(br.readLine());
        for(int x=0;x<n;x++)ar[x]=st.nextToken().charAt(0);
        return ar;
    }
    static char[][] arc(int n,int m)throws IOException
    {
        char ar[][]=new char[n][m];
        for(int x=0;x<n;x++)
        {
            String s=br.readLine();
            for(int y=0;y<m;y++)ar[x][y]=s.charAt(y);
        }
        return ar;
    }
    static void p(int ar[])
    {
        StringBuilder sb=new StringBuilder(2*ar.length);
        for(int a:ar)
        {
        	sb.append(a);
        	sb.append(' ');
        }
        System.out.println(sb);
    }
    static void p(int ar[][])
    {
    	StringBuilder sb=new StringBuilder(2*ar.length*ar[0].length);
        for(int a[]:ar)
        {
            for(int aa:a)
            {
            	sb.append(aa);
            	sb.append(' ');
            }
            sb.append("\n");
        }
        p(sb);
    }
    static void p(long ar[])
    {
        StringBuilder sb=new StringBuilder(2*ar.length);
        for(long a:ar)
        {
        	sb.append(a);
        	sb.append(' ');
        }
        System.out.println(sb);
    }
    static void p(long ar[][])
    {
    	StringBuilder sb=new StringBuilder(2*ar.length*ar[0].length);
        for(long a[]:ar)
        {
            for(long aa:a)
            {
            	sb.append(aa);
            	sb.append(' ');
            }
            sb.append("\n");
        }
        p(sb);
    }
    static void p(String ar[])
    {
    	int c=0;
    	for(String s:ar)c+=s.length()+1;
        StringBuilder sb=new StringBuilder(c);
        for(String a:ar)
        {
        	sb.append(a);
        	sb.append(' ');
        }
        System.out.println(sb);
    }
    static void p(double ar[])
    {
        StringBuilder sb=new StringBuilder(2*ar.length);
        for(double a:ar)
        {
        	sb.append(a);
        	sb.append(' ');
        }
        System.out.println(sb);
    }
    static void p(double ar[][])
    {
    	StringBuilder sb=new StringBuilder(2*ar.length*ar[0].length);
        for(double a[]:ar)
        {
            for(double aa:a)
            {
            	sb.append(aa);
            	sb.append(' ');
            }
            sb.append("\n");
        }
        p(sb);
    }
    static void p(char ar[])
    {
        StringBuilder sb=new StringBuilder(2*ar.length);
        for(char aa:ar)
        {
        	sb.append(aa);
        	sb.append(' ');
        }
        System.out.println(sb);
    }
    static void p(char ar[][])
    {
        StringBuilder sb=new StringBuilder(2*ar.length*ar[0].length);
        for(char a[]:ar)
        {
            for(char aa:a)
            {
            	sb.append(aa);
            	sb.append(' ');
            }
            sb.append("\n");
        }
        p(sb);
    }
}