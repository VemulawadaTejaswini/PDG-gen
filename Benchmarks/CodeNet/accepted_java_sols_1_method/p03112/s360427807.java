import java.util.*;


class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());
		long[] s = new long[A];
		long[] t = new long[B];
		long[] x = new long[Q];
		for (int i=0;i<A;i++) {
			s[i]=Long.parseLong(sc.next());
		}
		for (int i=0;i<B;i++) {
			t[i]=Long.parseLong(sc.next());
		}
		for (int i=0;i<Q;i++) {
			x[i]=Long.parseLong(sc.next());
		}

		ArrayList<long[]> list = new ArrayList<long[]>();
		list.add(s);
		list.add(t);
		list.add(t);
		list.add(s);
		ArrayList<Integer> limit = new ArrayList<Integer>();
		limit.add(A);
		limit.add(B);
		limit.add(B);
		limit.add(A);

		for (int i=0;i<Q;i++) {
			long[] dist = new long[8];

			for (int k=0;k<2;k++) {
				int[] index = new int[2];
				long[] S = list.get(2*k);
				long[] T = list.get(2*k+1);
				int A_A = limit.get(2*k);
				int B_B = limit.get(2*k+1);
		    	int result_1 = Arrays.binarySearch(S, x[i]);
		    	long[] dist_tmp = new long[2];
		    	if (result_1<0) {
		    		if (-result_1-2==-1) {
		    			dist_tmp[0]+=Math.abs(S[-result_1-1]-x[i]);
		    			dist_tmp[1]+=Math.abs(S[-result_1-1]-x[i]);
		    			index[0]=-result_1-1;
		    			index[1]=-result_1-1;
		    		} else if (-result_1-1==A_A) {
		    			dist_tmp[0]+=Math.abs(S[-result_1-2]-x[i]);
		    			dist_tmp[1]+=Math.abs(S[-result_1-2]-x[i]);
		    			index[0]=-result_1-2;
		    			index[1]=-result_1-2;
		    		} else {
		    			dist_tmp[0]+=Math.abs(S[-result_1-2]-x[i]);
		    			dist_tmp[1]+=Math.abs(S[-result_1-1]-x[i]);
		    			index[0]=-result_1-2;
		    			index[1]=-result_1-1;
		    		}
		    	}
		    	for (int j=0;j<2;j++) {
			    	int result_t = Arrays.binarySearch(T, S[index[j]]);
			    	if (result_t<0) {
			    		if (-result_t-2==-1) {
			    			dist[4*k+2*j]=dist_tmp[j]+Math.abs(T[-result_t-1]-S[index[j]]);
			    			dist[4*k+2*j+1]=dist_tmp[j]+Math.abs(T[-result_t-1]-S[index[j]]);
			    		} else if (-result_t-1==B_B) {
			    			dist[4*k+2*j]=dist_tmp[j]+Math.abs(T[-result_t-2]-S[index[j]]);
			    			dist[4*k+2*j+1]=dist_tmp[j]+Math.abs(T[-result_t-2]-S[index[j]]);
			    		} else {
			    			dist[4*k+2*j]=dist_tmp[j]+Math.abs(T[-result_t-2]-S[index[j]]);
			    			dist[4*k+2*j+1]=dist_tmp[j]+Math.abs(T[-result_t-1]-S[index[j]]);
			    		}
			    	}
			    }
			}
			Arrays.sort(dist);
	    	System.out.println(dist[0]);
    	}
	}
}