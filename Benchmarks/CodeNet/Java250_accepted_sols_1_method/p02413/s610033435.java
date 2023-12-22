import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a=br.readLine().split(" ");
        int r=Integer.parseInt(a[0]);
        int c=Integer.parseInt(a[1]);
        int[][] h=new int[r][c];
        for(int i=0;i<r;i++){
        	a=br.readLine().split(" ");
        	int s=0;
        	for(int j=0;j<c;j++){
        		h[i][j]=Integer.parseInt(a[j]);
        		System.out.print(h[i][j]+" ");
        		s+=h[i][j];
        	}
        	System.out.println(s);
        }
        int ts=0;
        for(int j=0;j<c;j++){
        	int s=0;
        	for(int i=0;i<r;i++){
        		s+=h[i][j];
        		ts+=h[i][j];
        	}
        	System.out.print(s+" ");
        }
        System.out.println(ts);
	}
}