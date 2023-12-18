import java.io.*;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		String[] spl = line1.split(" ");
		int r = Integer.parseInt(spl[0]);
		int c = Integer.parseInt(spl[1]);
		int[][] a = new int[r+1][c+1];
		for (int i = 0 ; i<r ; i++ ) {
			String line = br.readLine();
			String[] str = line.split(" ");
			for (int j = 0; j<c ; j++ ) {
				a[i][j] = Integer.parseInt(str[j]);
				a[i][c] += Integer.parseInt(str[j]);
				a[r][j] += Integer.parseInt(str[j]);
				a[r][c] += Integer.parseInt(str[j]);
			}	
		}
		for (int i = 0; i<r+1 ;i++ ) {
			for (int j = 0; j<c ;j++ ) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println(a[i][c]);
		}
		
		
	}
}