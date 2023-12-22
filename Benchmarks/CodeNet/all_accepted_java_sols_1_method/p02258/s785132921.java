import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static final int MAX = 200000;

	public static void main(String[] args) throws IOException {

		int Nums[] = new int[MAX];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String n = br.readLine();

		for(int i=0; i<Integer.parseInt(n); i++){
			 Nums[i] = Integer.parseInt(br.readLine());
			}


		int max = -2000000000;
		int min = Nums[0];

		for(int i=1; i<Integer.parseInt(n); i++){
			max = Math.max(max, Nums[i]-min);
			min = Math.min(min, Nums[i]);
		}

		System.out.println(max);

	}

}