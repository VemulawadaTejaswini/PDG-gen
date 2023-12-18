
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] c = br.readLine().split(" ");

		int[] a = new int[n];

		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(c[i]);
		}

		int counter=0;
		while(true) {
			Boolean b = true;
			for (int i = 0; i < a.length; i++) {
				if(a[i] % 2 != 0) {
					b = false;
				}
			}

			if (!b) {
				break;
			}

			for (int j = 0; j < a.length; j++) {
				a[j] = a[j] / 2;
			}
			counter++;
		}

		System.out.println(counter);


	}



}