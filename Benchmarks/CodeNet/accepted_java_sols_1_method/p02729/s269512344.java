import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String W = in.readLine();

			int N = Integer.parseInt(W.split(" ")[0]);
			int M = Integer.parseInt(W.split(" ")[1]);

         int allPatternsNM = (N + M)*(N + M -1)/2;
         int eachPatternsNM = N*M;
         int ans= allPatternsNM - eachPatternsNM;
         System.out.println(ans);
	}

}
