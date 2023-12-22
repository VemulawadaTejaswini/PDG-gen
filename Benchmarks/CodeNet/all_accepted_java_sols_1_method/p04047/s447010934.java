import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){

		BufferedReader buff = null;

		try {
			buff = new BufferedReader(new InputStreamReader(System.in));

			String line = buff.readLine();
			String[] box = buff.readLine().split(" ");
			int[] L = new int[box.length];
			for(int i = 0; i < box.length; ++i){
				L[i] = Integer.parseInt(box[i]);
			}

			for(int i = 0; i < L.length - 1; ++i){
				for(int j = i + 1; j < L.length; ++j){
					if(L[i] > L[j]){
						int sw = L[i];
						L[i] = L[j];
						L[j] = sw;
					}
				}

			}

			int ans = 0;
			for(int i = L.length - 2; i >= 0; i -= 2){

				ans += L[i];
			}

			System.out.println(ans);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}