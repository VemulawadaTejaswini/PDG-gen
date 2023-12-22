import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String b=" ",n="\n";
        String[] rc=br.readLine().split(b);
        int r=Integer.parseInt(rc[0]);
        int c=Integer.parseInt(rc[1]);
        int[][] h=new int[r+1][c+1];
        
        for(int i=0;i<r;i++){
        	String[] row=br.readLine().split(b);
        	for(int j=0;j<c;j++){
        		h[i][j]=Integer.parseInt(row[j]);
        		sb.append(h[i][j]+b);
        		h[i][c]+=h[i][j];
        		h[r][j]+=h[i][j];
        		h[r][c]+=h[i][j];
        	}
        	sb.append(h[i][c]+n);
        }
    	for(int j=0;j<c;j++) sb.append(h[r][j]+b);
        sb.append(h[r][c]);
        System.out.println(sb);
	}
}