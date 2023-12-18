import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a=br.readLine().split(" ");
        int n=Integer.parseInt(a[0]);
        int m=Integer.parseInt(a[1]);
        int l=Integer.parseInt(a[2]);
        int[][] A=new int[n][m];
        int[][] B=new int[m][l];
        for(int i=0;i<n;i++){
        	a=br.readLine().split(" ");
        	for(int j=0;j<m;j++){
        		A[i][j]=Integer.parseInt(a[j]);
        	}
        }
        for(int i=0;i<m;i++){
        	a=br.readLine().split(" ");
        	for(int j=0;j<l;j++){
        		B[i][j]=Integer.parseInt(a[j]);
        	}
        }
        for(int nc=0;nc<n;nc++){
    		String s="";
        	for(int lc=0;lc<l;lc++){
        		long b=0;
            	for(int mc=0;mc<m;mc++){
            		b+=A[nc][mc]*B[mc][lc];
            	}
            	s+=b+" ";
        	}
        	System.out.println(s.substring(0,s.length()-1));
        }
	}
}