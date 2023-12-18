import java.io.*;

 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		double [] array = new double[n+1];
		array[0] =1;
		String[] line2 = bf.readLine().split(" ");
		for( int i = 0; i < n; i++) {
			Double k = Double.parseDouble(line2[i]);
			for(int j = i+1 ;j >= 0; j--) {
				if( j == 0)
					array[j] = array[j]* (1-k);
				else
					array[j] = array[j-1]* k + array[j]* ((double)1-k);
			
			}
		}
		double fin = 0;
		for(int i = n/2 + 1; i <= n; i++)
			fin += array[i];
		System.out.println(fin);
	       
	}

}
