

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");

		int n = Integer.parseInt(tmpArray[0]);
		int q = Integer.parseInt(tmpArray[1]);

		int counter[] = new int[n + 1];
		int parent[] = new int[n + 1];
		int total[] = new int[n + 1];

		for(int i = 0; i < n - 1; i++){
			tmpArray = br.readLine().split(" ");

			int a = Integer.parseInt(tmpArray[0]);
			int b = Integer.parseInt(tmpArray[1]);

			parent[b] = a;
		}

		for(int i = 0; i < q; i++){
			tmpArray = br.readLine().split(" ");

			int p = Integer.parseInt(tmpArray[0]);
			int x = Integer.parseInt(tmpArray[1]);

			counter[p] += x;
		}

		for(int i = 1; i <= n; i++){
			if(i != 1){
				System.out.print(" ");
			}

			int result = 0;

//			int index = i;
//			while(index != 0){
//				result += counter[index];
//				index = parent[index];
//			}

			result += counter[i];
			result += total[parent[i]];
			total[i] = result;

			System.out.print(result);
		}
		System.out.println();
	}

}
