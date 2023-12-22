import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] f=br.readLine().split(" ");
        int n=Integer.parseInt(f[0]);
        int m=Integer.parseInt(f[1]);
        int l=Integer.parseInt(f[2]);
        int[][] A=new int[n][m];
        int[][] B=new int[m][l];
        for(int i=0;i<n;i++){
        	String[] s=br.readLine().split(" ");
        	for(int j=0;j<m;j++){
        		A[i][j]=Integer.parseInt(s[j]);
        	}
        }
        for(int i=0;i<m;i++){
        	String[] t=br.readLine().split(" ");
        	for(int j=0;j<l;j++){
        		B[i][j]=Integer.parseInt(t[j]);
        	}
        }
    	StringBuilder sb = new StringBuilder();
        for(int nc=0;nc<n;nc++){
        	for(int lc=0;lc<l;lc++){
        		long b=0;
            	for(int mc=0;mc<m;mc++){
            		b+=A[nc][mc]*B[mc][lc];
            	}
            	sb.append(b);
            	if(lc!=l-1) sb.append(" ");
        	}
        	sb.append("\n");
        }
    	System.out.print(sb);
	}
}