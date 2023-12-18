import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		//Input Initialize
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		str = br.readLine();
		int Nver = Integer.parseInt(str);
		int[] Ver = new int[Nver];
		for (int i = 0; i < Nver; i++) {
			Ver[i] = i + 1;
		}

		str =br.readLine();
		int Nhor = Integer.parseInt(str);

		for (int i = 0; i < Nhor; i++) {
			//Input swap
			str = br.readLine();
			String[] tmp = str.split(",", 0);
			int[] SW = new int[2];
			SW[0] = Integer.parseInt(tmp[0]);
			SW[1] = Integer.parseInt(tmp[1]);

			//Swap
			swap(Ver, SW[0], SW[1]);

		}

		for (int i = 0; i < Nver; i++) {
			System.out.println(Ver[i]);
		}
	}

	private  static void swap(int[] N, int a, int b) {
		int tmp;
		tmp = N[a-1]; N[a-1] = N[b-1]; N[b-1] = tmp;
		return;
	}

}