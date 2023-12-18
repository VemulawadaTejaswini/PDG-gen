import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));

		String[] box = buff.readLine().split(" ");
		int A = Integer.parseInt(box[0]);
		int B = Integer.parseInt(box[1]);
		int K = Integer.parseInt(box[2]);

		for(int i = 0; i < K; ++i){
			if(A + i > B - i){

			} else {
				System.out.println(A + i);
			}
		}
		for(int i = K - 1; i >= 0; --i){
			if(A + i >= B - i){

			} else {
				System.out.println(B - i);
			}
		}
	}

}
