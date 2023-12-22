import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int N = Integer.parseInt(str);

		String[] str2 = br.readLine().split(" ");;

		int[] w = new int[N];
		for(int i=0;i<N;i++) {
			w[i] = Integer.parseInt(str2[i]);
		}


		int abs = 0;
		for(int i=0;i<N;i++) {
			int suml = 0;
			int sumr = 0;

			for(int j=0;j<N;j++) {
				if(j<=i) {
					suml += w[j];
				}else {
					sumr += w[j];
				}
			}

			if(i==0) {
				abs = Math.abs(suml - sumr);
			}else if(abs>Math.abs(suml - sumr)) {
				abs = Math.abs(suml - sumr);
			}else {
				break;
			}

		}


		System.out.println(abs);

	}
}
