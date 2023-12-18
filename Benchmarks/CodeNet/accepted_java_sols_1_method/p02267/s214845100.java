import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] ss = br.readLine().split(" ");

		int[] S  = new int[n];

		for(int i=0; i<n; i++){
			S[i] = Integer.parseInt(ss[i]);
		}

		int q = Integer.parseInt(br.readLine());

		String[] qq = br.readLine().split(" ");

		int[] Q = new int[q];


		for(int i=0; i<q; i++){
			Q[i] = Integer.parseInt(qq[i]);
		}

		int count =0;

		for(int i=0; i<q; i++){
			for(int k=0; k<n; k++){
				if(S[k] == Q[i]){
					count++;
					break;
				}
			}
		}

		System.out.println(count);



	}

}