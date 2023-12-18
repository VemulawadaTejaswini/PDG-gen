import java.util.Scanner;

class Main {
	public static final String STABLE="Stable" +
			"";
	public static final String UNSTABLE="Not stable";
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] c = new String[n];
		for (int i = 0; i < n; i++) {
			c[i] = in.next();
		}
		bubbleSort(c.clone(),c);
		selectionSort(c.clone(),c);
		in.close();
	}

	private static boolean isStable( String[] in, String[] out) {
	   String s1="";
	   String s2="";
	   int m1=0;
	   int m2=0;
	   for (int i = 0; i<in.length;i++){
	     for (int j = i+1; j<in.length;j++){
	    	 if(Integer.valueOf(in[i].substring(1)).equals(Integer.valueOf(in[j].substring(1)))) {
	    		 s1=in[i];
	    		 s2=in[j];
	    		 for (int a = 0; a<out.length;a++){
	    			 if(out[a].equals(s1)) {
	    				 m1=a;

	    			 }
	    			 if(out[a].equals(s2)) {
	    				 m2=a;

	    			 }
	    		 }
	    		 if(m1>m2) {
	    			 return false;
	    		 }
	    	 }
	     }
	   }
	   return true;
	}

	private static void selectionSort(String[] A,String[] moto) {
		int minj;
		String wk;
		for (int i = 0; i < A.length; i++) {
			minj = i;
			for (int j = i; j < A.length; j++) {
				if (Integer.valueOf(A[j].substring(1)) < Integer.valueOf(A[minj].substring(1))) {

					minj = j;

				}

			}
			if(minj!=i) {
				wk=A[minj];
				A[minj]=A[i];
				A[i]=wk;

			}
		}

		System.out.println(String.join(" ", A));

		System.out.println(isStable(A,moto)? STABLE:UNSTABLE);
	}

	private static void bubbleSort(String[] A,String[] moto) {
		int flg = 1;
		String wk;
		while (flg == 1) {
			flg = 0;
			for (int i = A.length - 1; i > 0; i--) {
				wk = A[i - 1];

				if (Integer.valueOf(A[i].substring(1))  < Integer.valueOf(A[i - 1].substring(1)) ) {
					A[i - 1] = A[i];
					A[i] = wk;

					flg = 1;
				}
			}

		}

		System.out.println(String.join(" ", A));

		System.out.println(isStable(A,moto)? STABLE:UNSTABLE);
	}

}

