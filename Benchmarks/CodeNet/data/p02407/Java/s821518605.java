import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {

		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String buf = br.readLine();
			int n = Integer.parseInt(buf);
			buf = br.readLine();
			StringTokenizer st = new StringTokenizer(buf, " ");
			int[] a = new int[n];

			for(int i=0;i<n;i++){

				a[i]=Integer.parseInt(st.nextToken());
			}

			for(int i=n-1;i>=0;i--){
				System.out.print(a[i]);
				if(i!=0)	System.out.print(" ");
				else	System.out.println();
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}