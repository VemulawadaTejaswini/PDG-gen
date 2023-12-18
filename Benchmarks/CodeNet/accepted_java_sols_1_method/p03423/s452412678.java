import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String dataDim = br.readLine();
	    StringTokenizer st = new StringTokenizer(dataDim);
	    StringBuilder sb = new StringBuilder();
	    int N = Integer.parseInt(st.nextToken());
	    System.out.println(N/3);
	}
}