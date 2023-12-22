import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] f=br.readLine().split(" ");
        int n=Integer.parseInt(f[0]);
        int m=Integer.parseInt(f[1]);
        int l=Integer.parseInt(f[2]);
        String[][] As=new String[n][m];
        String[][] Bs=new String[m][l];
        int[][] Ai=new int[n][m];
        int[][] Bi=new int[m][l];
        for(int ni=0;ni<n;ni++) As[ni]=br.readLine().split(" ");
        for(int mi=0;mi<m;mi++) Bs[mi]=br.readLine().split(" ");
    	StringBuilder sb = new StringBuilder();
        for(int ni=0;ni<n;ni++){
        	for(int li=0;li<l;li++){
        		long b=0;
            	for(int mi=0;mi<m;mi++){
            		if(Ai[ni][mi]==0) Ai[ni][mi]=Integer.parseInt(As[ni][mi]);
            		if(Bi[mi][li]==0) Bi[mi][li]=Integer.parseInt(Bs[mi][li]);
            		b+=Ai[ni][mi]*Bi[mi][li];
            	}
            	sb.append(b);
            	if(li!=l-1) sb.append(" ");
        	}
        	sb.append("\n");
        }
    	System.out.print(sb);
	}
}