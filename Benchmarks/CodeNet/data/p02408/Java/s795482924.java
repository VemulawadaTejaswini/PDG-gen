import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		boolean[] S = new boolean[13];
		boolean[] H = new boolean[13];
		boolean[] C = new boolean[13];
		boolean[] D = new boolean[13];
        for(int i=0;i<N;i++){
            String[] a = br.readLine().split(" ");
        	switch(a[0].charAt(0)){
        	case 'S':
        		S[Integer.parseInt(a[1])-1]=true;
        		break;
        	case 'H':
        		H[Integer.parseInt(a[1])-1]=true;
        		break;
        	case 'C':
        		C[Integer.parseInt(a[1])-1]=true;
        		break;
        	case 'D':
        		D[Integer.parseInt(a[1])-1]=true;
        		break;
        	}
        }
        for(int i=0;i<13;i++) if(!S[i]) System.out.println("S "+(i+1));
        for(int i=0;i<13;i++) if(!H[i]) System.out.println("H "+(i+1));
        for(int i=0;i<13;i++) if(!C[i]) System.out.println("C "+(i+1));
        for(int i=0;i<13;i++) if(!D[i]) System.out.println("D "+(i+1));
	}
}