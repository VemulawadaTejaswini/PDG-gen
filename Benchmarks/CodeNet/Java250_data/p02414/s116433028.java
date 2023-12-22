import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sp=" ";
        String[] f=br.readLine().split(sp);
        int n=Integer.parseInt(f[0]);
        int m=Integer.parseInt(f[1]);
        int l=Integer.parseInt(f[2]);
        int[][] A=new int[n][m];
        int[][] B=new int[m][l];
        String[] s;
        for(int i=0;i<n;i++){
        	s=br.readLine().split(sp);
        	for(int j=0;j<m;j++) A[i][j]=Integer.parseInt(s[j]);
        }
        for(int i=0;i<m;i++){
        	s=br.readLine().split(sp);
        	for(int j=0;j<l;j++) B[i][j]=Integer.parseInt(s[j]);
        }
    	StringBuilder sb = new StringBuilder();
    	long b;
        for(int ni=0;ni<n;ni++){
        	for(int li=0;li<l;li++){
        		b=0;
            	for(int mi=0;mi<m;mi++) b+=A[ni][mi]*B[mi][li];
            	sb.append(b);
            	if(li!=l-1) sb.append(sp);
        	}
        	sb.append("\n");
        }
    	System.out.print(sb);
	}
}