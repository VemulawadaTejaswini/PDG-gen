import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] array = br.readLine().split(" ");
        int n = Integer.parseInt(array[0]);
        int m = Integer.parseInt(array[1]);
        int[][] a = new int[n][m];
        int[] b = new int[m];
        for(int i=0;i<n;i++){
            array = br.readLine().split(" ");
            for(int j=0;j<m;j++){
            	a[i][j] = Integer.parseInt(array[j]);
            }
        }
        for(int i=0;i<m;i++){
        	b[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0;i<n;i++){
        	int c=0;
        	for(int j=0;j<m;j++){
        		c+=a[i][j]*b[j];
        	}
        	System.out.println(c);
        }
	}
}