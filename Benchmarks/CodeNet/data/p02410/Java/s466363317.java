import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm=br.readLine().split(" ");
        int n=Integer.parseInt(nm[0]);
        int m=Integer.parseInt(nm[1]);
        int[][] a=new int[n][m];
        int[] b=new int[m];
        for(int i=0;i<n;i++){
        	String[] aa=br.readLine().split(" ");
            for(int j=0;j<m;j++) a[i][j]=Integer.parseInt(aa[j]);
        }
        for(int i=0;i<m;i++){
        	b[i]=Integer.parseInt(br.readLine());
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
        	int c=0;
        	for(int j=0;j<m;j++) c+=a[i][j]*b[j];
        	sb.append(c+"\n");
        }
        System.out.print(sb);
	}
}