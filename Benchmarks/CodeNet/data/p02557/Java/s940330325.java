	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        long[] a = new long[N+5];
	        long[] b = new long[N+5];
	        int[] m = new int[N+5];
	        int[] ms = new int[N+5];
	        int[] m1 = new int[N+5];
	        int[] m1s = new int[N+5];
	        
	        for (int i=0 ; i<N; i++) {
	        	a[i] = Long.parseLong(sc.next());
	        	m[(int)a[i]]++;
	        	if(m[(int)a[i]]==1) {
	        		ms[(int)a[i]]=i;
	        	}
	        }
	        for (int i=0 ; i<N; i++) {
	        	b[i] = Long.parseLong(sc.next());
	        	m1[(int)b[i]]++;
	        	if(m[(int)a[i]]==1) {
	        		m1s[(int)a[i]]=i;
	        	}
	        }
	        
	        int[] ans = new int[N];
	        int min = Integer.MAX_VALUE;
	        int minn=0;
	        for (int i=0 ; i<N; i++) {
	        	int yo = (N-m[i])-m1[i] ;
	        	if(yo<min) {
	        		minn=i;
	        		min=yo;
	        	}
	        }

	        if(min<0) {
	        	System.out.println("No");
	        } else {
	        	System.out.println("Yes");
	        	for(int i=0;i<N;i++) {
	        		ans[(i+ms[minn+1])%N] = (int) b[(m1s[minn]+i)%N];
	        	}
	        	StringBuffer str = new StringBuffer();
	        	for(int i=0;i<N;i++) {
	        		str.append(ans[i]);
	        		str.append(" ");
	        	}
	        	System.out.println(str);
	        }
	        
		 }
		 
	 
	}