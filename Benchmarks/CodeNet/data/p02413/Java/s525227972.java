import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		String b=" ",n="\n";
        String[] rc=br.readLine().split(b);
        int r=Integer.parseInt(rc[0]);
        int c=Integer.parseInt(rc[1]);
        int[][] h=new int[r+1][c+1];
        
        for(int i=0;i<r;i++){
        	String[] row=br.readLine().split(b);
        	int j=0;
        	for(String num:row){
        		h[i][j]=Integer.parseInt(num);
        		h[i][c]+=h[i][j];
        		h[r][j]+=h[i][j];
        		h[r][c]+=h[i][j];
        		sb1.append(h[i][j]+b);
        		if(i==r-1) sb2.append(h[r][j]+b);
        		j++;
        	}
        	sb1.append(h[i][c]+n);
        }
        sb2.append(h[r][c]);
        System.out.print(sb1);
        System.out.println(sb2);
	}
}