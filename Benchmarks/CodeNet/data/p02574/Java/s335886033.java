	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 static int a_dist[];
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();	
	        long[] a = new long[N];
	        for (int i=0 ; i<N; i++) {
	            a[i] = Long.parseLong(sc.next());
	        }

	        int H = 1000005;
	        int[] m = new int[H];
	        int[] p = new int[H];
	        int k=0;
	        m[1]=1;
	        for(int i=2;i<H;i++) {
	        	if(m[i]==0) {
	        		m[i]=1;
	        		p[k]=i;
	        		k++;
	        		for(int j=i+i;j<H;j=j+i) {
	        			m[j]=i;
	        		}
	        	}
	        }		        
	        
	        int[] m1 = new int[H];
	        int[] m2 = new int[H];
	        int[] z = new int[N];
	        String ans = "pairwise coprime";
	        for(int i=0;i<N;i++) {
		        int[] mn = new int[H];
	        	while(a[i]!=1) {
	        		if(m[(int)a[i]]!=1) {
	        			if(m[(int)a[i]]<1000) {
		        			mn[m[(int)a[i]]]++;
		        			a[i]=a[i]/m[(int)a[i]];	        				
	        			} else {
	        				z[i]=m[(int)a[i]];
	        				a[i]=a[i]/m[(int)a[i]];	 
	        			}
	        		} else {
	        			mn[(int)a[i]]++;
	        			a[i]=1;
	        		}
	        	}
	        	for(int j=0;j<200;j++) {
	        		if(i==0) {
	        			m1[j]=mn[j];
	        			m2[j]=mn[j];
	        		} else {
	        			m1[j]=Math.min(m1[j], mn[j]);
	        			if(m2[j]!=0&&mn[j]!=0)ans = "setwise coprime";
	        			m2[j]=Math.max(m2[j], mn[j]);
	        		}
	        	}
	        }
	        
	        Arrays.sort(z);
	        for(int i=0;i<N-1;i++) {
	        	if(z[i]==z[i+1]&&z[i]!=0) {
	        		ans = "not coprime";
	        	}
	        }
	        for(int i=0;i<200;i++) {
	        	if(m1[i]!=0)ans = "not coprime";
	        }
	        
	        System.out.println(ans);
		 }
		 
	}