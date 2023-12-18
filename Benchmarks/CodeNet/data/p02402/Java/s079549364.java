import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String lineN = br.readLine();
		String[] lineA = br.readLine().split(" ");
		int n = Integer.parseInt(lineN);
		int[] a = new int[n];
		int min = Integer.parseInt(lineA[0]);
		int max = min;
		long sun = 0L;
		for(int i=0; i < a.length; i++){
			a[i] = Integer.parseInt(lineA[i]);
			sun = sun + a[i];
			if( max < a[i] ){
				max = a[i];
			}
			if( min > a[i] ){
				min = a[i];
			}
		}
		System.out.println(min + " " + max + " " + sun);
	}
}