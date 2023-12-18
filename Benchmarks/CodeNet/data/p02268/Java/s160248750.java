import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
		int n = Integer.parseInt(r.readLine());
		System.out.println(n);
		String Sinput = r.readLine();
		String[] S = Sinput.split(" ", 0);
		System.out.println(S);
		int q = Integer.parseInt(r.readLine());
		System.out.println(q);

		String Tinput = r.readLine();
		String[] T =  Tinput.split(" ", 0);
		int cnt = 0;
		for (int i=0; i<q; i++) {
			for (int j=0; j<n; j++) {
				if(i < n) {
					if (Integer.parseInt(S[i]) == Integer.parseInt(T[j])) {
						cnt++;
					} else {
						System.out.println("skip");
					}
				}

			}
		}
		System.out.println(cnt);
	}

}